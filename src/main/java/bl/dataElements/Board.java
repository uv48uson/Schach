package bl.dataElements;

import java.util.Collection;

import bl.Player;
import bl.Position;
import bl.PositionOffBoardException;
import bl.dataElements.Chessman.Color;

public abstract class Board {
    protected Chessman[][] square;
    Player[] players;
    
    public Board(Player[] players){
    	this.players = players;
    }
    
    /*
     * - If Position is occupied by the color of the Chessman parameter, PositionOccupiedEception is thrown
     * - If Position is not covered by one of the boards, PositionOffBoardException is thrown
     * - If Position is not occupied. The Chessman is set and the Chessman Position is updated
     * - If Position is occupied by the opponents color(not the one of the provided chessman) this method
     * 	automaticly calls capture(oldChessman) on the opponent player, updates the newChessmans Position
     * 	sets the chessman 
     * @param Chessman to be set. Position to set the Chessman to.
     */
	public abstract void setChessman(Position newPosition, Chessman chessman) throws PositionOffBoardException, PositionOccupiedException;
	
	/*
	 * @return
	 * - If Position is not covered by one of the boards, PositionOffBoardException is thrown
	 * - Else null or the chessman at the position is returned
	 */
	public abstract Chessman getChessman(Position position) throws PositionOffBoardException;
	
	/*
	 * @return
	 * - If Position is not covered by one of the boards, PositionOffBoardException is thrown
	 * - If there is no Chessman at the provided position FALSE is returned
	 * - Else true is returned
	 */
    public abstract boolean isOccupied(Position position) throws PositionOffBoardException;
    
    /*
     * - the provided collection positions is modified so that it does not contain any position
     * which can be attacked by an enemy chessman.
     * - position which are not onboard are removed too 
     */
    public void filterAttackedMoves(Color color, Collection<Position> positions){
    	for(Position position: positions){
    		try {
				if(isAttackable(color, position)){
					positions.remove(position);
				}
			} catch (PositionOffBoardException e) {
				positions.remove(position);
			}
    	}
    }
    
    /*
     * - if any enemy chessman can move to the provided position false is returned
     */
    protected boolean isAttackable(Color color, Position position) throws PositionOffBoardException{
        for(Player player : players){
        	if(player.getColor() == color){
        		for(Chessman chessman : player.getChessmen()){
            		if(chessman.getPossibleMoves(this).contains(position)){
            			return true;
            		}
            	}
        		break;
        	}
        }
        return false;
    }

}