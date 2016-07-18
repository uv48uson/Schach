package bl;

import java.util.Collection;

import bl.dataElements.Board;
import bl.dataElements.Chessman;

public class KI extends Player {
    Scoreboard score;
    
    public KI(Collection<Chessman> chessmen, Board board, Scoreboard score){
        super(chessmen, board);
        this.score = score;
    }
}