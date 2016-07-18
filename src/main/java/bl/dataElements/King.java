//package bl.dataElements;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//import bl.Position;
//
//public class King extends Chessman {
//    
//    public King(Color color) {
//        super(color);
//    }
//
//    @Override
//    public Collection<Position> getPossibleMoves() {
//        Collection<Position> moves = new ArrayList<Position>();
//        
//        moves.addAll(addMoveVertically(position.getX()+1, position.getY()-1));
//        moves.addAll(addMoveVertically(position.getX()+1, position.getY()));
//        moves.addAll(addMoveVertically(position.getX()+1, position.getY()+1));
//        moves.addAll(addMoveVertically(position.getX(), position.getY()-1));
//        moves.addAll(addMoveVertically(position.getX(), position.getY()+1));
//        moves.addAll(addMoveVertically(position.getX()-1, position.getY()-1));
//        moves.addAll(addMoveVertically(position.getX()-1, position.getY()));
//        moves.addAll(addMoveVertically(position.getX()-1, position.getY()+1));
//        
//        return moves;
//    }
//}