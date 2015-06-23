package bl;

import java.util.Collection;

import bl.dataElements.Board;
import bl.dataElements.Chessman;

public class KI extends Player {
    
    public KI(Collection<Chessman> chessmen, Board board){
        super(chessmen, board);
    }
}