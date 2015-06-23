package bl;

import java.util.Collection;

import bl.dataElements.Board;
import bl.dataElements.Chessman;


public class Person extends Player {
    
    public Person(Collection<Chessman> chessmen, Board board){
        super(chessmen, board);
    }
}