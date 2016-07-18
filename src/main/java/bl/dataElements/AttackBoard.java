//package bl.dataElements;
//
//import bl.Player;
//import bl.Position;
//import bl.PositionOffBoardException;
//import bl.dataElements.Chessman.Color;
//
//
//public class AttackBoard extends Board {
//    private AttackBoardLocation location;
//    
//    public AttackBoard(Location location){
//        square = new Chessman[2][2];
//    }
//
//    @Override
//    public void setChessman(Position newPosition, Chessman chessman) throws PositionOffBoardException, PositionOccupiedException {
//        if(!location.isOnBoard(newPosition)){
//            throw new PositionOffBoardException();
//        }
//        if(square[newPosition.getX()-location.getXOffSet()][newPosition.getY()-location.getYOffSet()] != null){
//            Chessman oldChessman = square[newPosition.getX()-location.getXOffSet()][newPosition.getY()-location.getYOffSet()];
//            if(oldChessman.getColor() == chessman.getColor()){
//                throw new PositionOccupiedException();
//            }else{
//                for(Player player: players){
//                	if(player.getColor() == oldChessman.getColor()){
//                		player.capture(oldChessman);
//                    	break;
//                	}
//                }
//            }
//        }
//        square[newPosition.getX()-location.getXOffSet()][newPosition.getY()-location.getYOffSet()] = chessman;
//    }
//
//	@Override
//	public Chessman getChessman(Position position) throws PositionOffBoardException {
//		if(!location.isOnBoard(position)){
//			throw new PositionOffBoardException();
//		}
//		
//		return square[position.getX()-location.getXOffSet()][position.getY()-location.getYOffSet()];
//		
//	}
//
//	@Override
//	public boolean isOccupied(Position position) throws PositionOffBoardException {
//		if(!location.isOnBoard(position)){
//			throw new PositionOffBoardException();
//		}
//		if(square[position.getX()-location.getXOffSet()][position.getY()-location.getYOffSet()] == null){
//			return false;
//		}
//		return true;
//		
//	}
//}