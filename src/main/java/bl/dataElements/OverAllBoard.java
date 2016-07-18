package bl.dataElements;

import bl.Player;
import bl.Position;
import bl.PositionOffBoardException;


public class OverAllBoard extends Board {
    Board[] boards = new Board[7];

    public OverAllBoard(Player[] players) {
        super(players);
        
//        boards[0] = new MainBoard(MainBoardLocation.Bottom);
//        boards[1] = new MainBoard(MainBoardLocation.Middle);
//        boards[2] = new MainBoard(MainBoardLocation.Top);
//        
//        boards[3] = new AttackBoard(AttackBoardLocation.LFB);
//        boards[4] = new AttackBoard(AttackBoardLocation.RFB);
//        boards[5] = new AttackBoard(AttackBoardLocation.LBT);
//        boards[6] = new AttackBoard(AttackBoardLocation.RBT);
    }

    @Override
    public void setChessman(Position newPosition, Chessman chessman) throws PositionOffBoardException, PositionOccupiedException {
        boolean isOnBoard = false;
        for (int i = 0; i < boards.length; i++) {
            try {
                boards[i].setChessman(newPosition, chessman);
            } catch (PositionOffBoardException e) {
                continue;
            }
            isOnBoard = true;
            break;
        }
        if (!isOnBoard) {
            throw new PositionOffBoardException();
        }
        
    }
    
    @Override
	public Chessman getChessman(Position position) throws PositionOffBoardException{
        for(Board board: boards){
            try{
                return board.getChessman(position);
            }catch(PositionOffBoardException ex){
                continue;
            }
        }
        
        throw new PositionOffBoardException();
    }

    @Override
	public boolean isOccupied(Position position) throws PositionOffBoardException{
        for(Board board: boards){
            try{
                return board.isOccupied(position);
            }catch(PositionOffBoardException ex){
                continue;
            }
        }
        
        throw new PositionOffBoardException();
    }
}