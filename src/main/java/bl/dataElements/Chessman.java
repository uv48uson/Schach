package bl.dataElements;

import java.nio.charset.CoderMalfunctionError;
import java.util.ArrayList;
import java.util.Collection;
import bl.Position;
import bl.PositionOffBoardException;

public abstract class Chessman {

    public enum Color {
        White, Black
    }
    
    protected Color color;
    protected int value;
    protected Position position;

	public Chessman(Color color) {
        this.color = color;
    }

    public void setColor(Color color){
        this.color = color;
    }
    
    public Color getColor(){
        return color;
    }
    
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    
    public int getValue(){
        return value;
    }
    
	public abstract Collection<Position> getPossibleMoves(Board board);
	
	//eventual in Position
	protected Collection<Position> addMoveVertically(int x, int y) {
	    Collection<Position> moves = new ArrayList<Position>();
	    
	    for(int z = 0; z <= Position.MAX_Z; z++){
            try{
                Position move = new Position(x,y,z);
                moves.add(move);
            }catch(PositionOffBoardException ex){
            }
        }
	    
	    return moves;
    }
	
	protected Collection<Position> addMoveHorizontal(Board board) {
	    Collection<Position> moves = new ArrayList<Position>();
	    
	    moves.addAll(addMoveForward(board));
	    
	    moves.addAll(addMoveBackward(board));
	    
	    moves.addAll(addMoveRight(board));
	    
	    moves.addAll(addMoveLeft(board));
	    
	    return moves;
    }
	
	protected Collection<Position> addMoveForward(Board board) {
	    Collection<Position> moves = new ArrayList<Position>();
	    
	    for(int x = position.getX()+1;  x <= Position.MAX_X; x++){
            Collection<Position> newStep = addMoveVertically(x, position.getY());
            
            if(getUnblockedLevels(board, newStep)){
            	break;
            }
        }
	    
	    return moves;
	}
	
	protected Collection<Position> addMoveBackward(Board board) {
        Collection<Position> moves = new ArrayList<Position>();
        
        for(int x = position.getX()-1;  x >= 0; x--){
            Collection<Position> newStep = addMoveVertically(x, position.getY());
            
            if(getUnblockedLevels(board, newStep)){
            	break;
            }
        }
        
        return moves;
    }
	
	protected Collection<Position> addMoveRight(Board board) {
        Collection<Position> moves = new ArrayList<Position>();
        
        for(int y = position.getY()+1; y <= Position.MAX_Y; y++){
            Collection<Position> newStep = addMoveVertically(position.getX(), y);
            
            if(getUnblockedLevels(board, newStep)){
            	break;
            }
        }
        
        return moves;
    }
	
	protected Collection<Position> addMoveLeft(Board board) {
        Collection<Position> moves = new ArrayList<Position>();
        
        for(int y = position.getY()-1; y >= 0; y--){
            Collection<Position> newStep = addMoveVertically(position.getX(), y);
            
            if(getUnblockedLevels(board, newStep)){
            	break;
            }
        }
        
        return moves;
    }
	
	protected Collection<Position> addMoveDiagonal(Board board) {
        Collection<Position> moves = new ArrayList<Position>();
        
        moves.addAll(addMoveForwardRight(board));
        
        moves.addAll(addMoveBackwardLeft(board));
        
        moves.addAll(addMoveForwardLeft(board));
        
        moves.addAll(addMoveBackwardRight(board));
        
        return moves;
    }
	
	protected Collection<Position> addMoveForwardRight(Board board) {
        Collection<Position> moves = new ArrayList<Position>();
        
        for(int x = position.getX(), y = position.getY();  x <= Position.MAX_X && y <= Position.MAX_Y; x++, y++){
            Collection<Position> newStep = addMoveVertically(x, y);
            
            if(getUnblockedLevels(board, newStep)){
            	break;
            }
        }
        
        return moves;
    }
	
	protected Collection<Position> addMoveBackwardLeft(Board board) {
        Collection<Position> moves = new ArrayList<Position>();
        
        for(int x = position.getX(), y = position.getY();  x >= 0 && y >= 0; x--, y--){
            Collection<Position> newStep = addMoveVertically(x, y);
            
            if(getUnblockedLevels(board, newStep)){
            	break;
            }
        }
        
        return moves;
    }

	protected Collection<Position> addMoveForwardLeft(Board board) {
        Collection<Position> moves = new ArrayList<Position>();
        
        for(int x = position.getX(), y = position.getY();  x >= 0 && y <= Position.MAX_Y; x--, y++){
            Collection<Position> newStep = addMoveVertically(x, y);
            
            if(getUnblockedLevels(board, newStep)){
            	break;
            }
        }
        
        return moves;
    }
	
	protected Collection<Position> addMoveBackwardRight(Board board) {
        Collection<Position> moves = new ArrayList<Position>();
        
        for(int x = position.getX(), y = position.getY();  x <= Position.MAX_X && y >= 0; x++, y--){
            Collection<Position> newStep = addMoveVertically(x, y);
            
            if(getUnblockedLevels(board, newStep)){
            	break;
            }
        }
        
        return moves;
    }

    private boolean getUnblockedLevels(Board board,
            Collection<Position> newStep){
    	
    	boolean isBlocked = false;
        for(Position step: newStep){
            try {
                if(board.isOccupied(step)){
                    if(board.getChessman(step).getColor() == this.getColor()){
                    	newStep.remove(step);
                    }
                    isBlocked = true;
                }
            } catch (PositionOffBoardException e) {
                throw new CoderMalfunctionError(null);
            }
        }
        return isBlocked;
    }
}