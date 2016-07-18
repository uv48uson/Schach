package bl;

import java.util.Collection;

import bl.dataElements.Board;
import bl.dataElements.Chessman;
import bl.dataElements.Chessman.Color;

public abstract class Player {
    Board board;
    Collection<Chessman> chessmen;
    boolean isCheck = false;
    
    public Player (Collection<Chessman> chessmen, Board board){
        this.board = board;
        this.chessmen = chessmen;
    }

	public void performMove() {
//		try {
//            //wait(1000);
//            System.out.println(chessmen.iterator().next().getColor());
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
	}

    public boolean isCheckMate() {
        if(isCheck){
//            Collection<Chessman> kings = chessmen.stream().filter(c -> c instanceof King).collect(Collectors.toList());
//            Collection<Position> moves = kings.iterator().next().getPossibleMoves(board);
//            board.filterAttackedMoves(kings.iterator().next().getColor(), moves);
//            
//            if(moves.size() == 0){
//                return true;
//            }
        }
        
        return false;
    }
    
    public void capture(Chessman chessman){
    	chessmen.remove(chessmen);
    }

	public Color getColor() {
		return ((Chessman)chessmen.toArray()[0]).getColor();
	}
	
	public Collection<Chessman> getChessmen(){
		return chessmen;
	}

}