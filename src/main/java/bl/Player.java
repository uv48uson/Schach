package bl;

import java.util.Collection;

import bl.dataElements.Board;
import bl.dataElements.Chessman;

public abstract class Player {
    Board board;
    Collection<Chessman> chessmen;
    
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

}