package bl.dataElements;

import bl.Player;
import bl.Position;
import bl.PositionOffBoardException;

public class MainBoard extends Board {

	public MainBoard(Player[] players) {
		super(players);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setChessman(Position newPosition, Chessman chessman) throws PositionOffBoardException,
			PositionOccupiedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Chessman getChessman(Position position) throws PositionOffBoardException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isOccupied(Position position) throws PositionOffBoardException {
		// TODO Auto-generated method stub
		return false;
	}
//    private MainBoardLocation location;
//    
//    public MainBoard(MainBoardLocation location) {
//        this.location = location;
//    }
//
//    @Override
//    public void setChessman(Position newPosition, Chessman chessman){
//        
//    }
}