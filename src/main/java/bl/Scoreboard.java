package bl;

import bl.dataElements.Board;

public class Scoreboard {
    Player[] players;
    Board board;

	public Scoreboard(Player[] players, Board board) {
	    this.players = players;
	    this.board = board;
    }

    /**
	 * 
	 * @param player
	 */
	public double getChessmenValues(Player player) {
		// TODO - implement Scoreboard.getChessmenValues
		throw new UnsupportedOperationException();
	}

    public boolean isCheckMate(Player player) {
        // TODO Auto-generated method stub
        return false;
    }

}