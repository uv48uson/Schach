package bl;

import java.util.ArrayList;
import java.util.Collection;

import bl.dataElements.AttackBoard;
import bl.dataElements.Bishop;
import bl.dataElements.Board;
import bl.dataElements.Chessman;
import bl.dataElements.Kight;
import bl.dataElements.King;
import bl.dataElements.MainBoard;
import bl.dataElements.OverAllBoard;
import bl.dataElements.Pawn;
import bl.dataElements.Queen;
import bl.dataElements.Rook;

public class ChessmenInitialisator {
    
    public static void initializeNormalGame(Collection<Chessman> blackChessmen, Collection<Chessman> whiteChessmen, Board board) throws PositionOffBoardException{
        
        blackChessmen = initializeBlackChessmen(board);
        whiteChessmen = initializeWhiteChessmen(board);
    }

    private static Collection<Chessman> initializeWhiteChessmen(Board board) throws PositionOffBoardException {
        Collection<Chessman> chessmen = new ArrayList<Chessman>();
        
        addChessman(new Position(0,0,1), new Rook(Chessman.Color.White), chessmen, board);
        addChessman(new Position(1,0,1), new Queen(Chessman.Color.White), chessmen, board);
        addChessman(new Position(1,1,0), new Kight(Chessman.Color.White), chessmen, board);
        addChessman(new Position(2,1,0), new Bishop(Chessman.Color.White), chessmen, board);
        addChessman(new Position(3,1,0), new Bishop(Chessman.Color.White), chessmen, board);
        addChessman(new Position(4,1,0), new Kight(Chessman.Color.White), chessmen, board);
        addChessman(new Position(4,0,1), new King(Chessman.Color.White), chessmen, board);
        addChessman(new Position(5,0,1), new Rook(Chessman.Color.White), chessmen, board);
        
        addChessman(new Position(0,1,1), new Pawn(Chessman.Color.White), chessmen, board);
        addChessman(new Position(1,1,1), new Pawn(Chessman.Color.White), chessmen, board);
        addChessman(new Position(1,2,0), new Pawn(Chessman.Color.White), chessmen, board);
        addChessman(new Position(2,2,0), new Pawn(Chessman.Color.White), chessmen, board);
        addChessman(new Position(3,2,0), new Pawn(Chessman.Color.White), chessmen, board);
        addChessman(new Position(4,2,0), new Pawn(Chessman.Color.White), chessmen, board);
        addChessman(new Position(4,1,1), new Pawn(Chessman.Color.White), chessmen, board);
        addChessman(new Position(5,1,1), new Pawn(Chessman.Color.White), chessmen, board);
        
        return chessmen;
    }
    
    private static void addChessman(Position position, Chessman chessman, Collection<Chessman> chessmen, Board board){
        chessmen.add(chessman);
        board.setChessman(position, chessman);
    }
    
    private static Collection<Chessman> initializeBlackChessmen(Board board) throws PositionOffBoardException {
        Collection<Chessman> chessmen = new ArrayList<Chessman>();
        
        addChessman(new Position(0,9,3), new Rook(Chessman.Color.Black), chessmen, board);
        addChessman(new Position(1,9,3), new Queen(Chessman.Color.Black), chessmen, board);
        addChessman(new Position(1,8,2), new Kight(Chessman.Color.Black), chessmen, board);
        addChessman(new Position(2,8,2), new Bishop(Chessman.Color.Black), chessmen, board);
        addChessman(new Position(3,8,2), new Bishop(Chessman.Color.Black), chessmen, board);
        addChessman(new Position(4,8,2), new Kight(Chessman.Color.Black), chessmen, board);
        addChessman(new Position(4,9,3), new King(Chessman.Color.Black), chessmen, board);
        addChessman(new Position(5,9,3), new Rook(Chessman.Color.Black), chessmen, board);
        
        addChessman(new Position(0,8,3), new Pawn(Chessman.Color.Black), chessmen, board);
        addChessman(new Position(1,8,3), new Pawn(Chessman.Color.Black), chessmen, board);
        addChessman(new Position(1,7,2), new Pawn(Chessman.Color.Black), chessmen, board);
        addChessman(new Position(2,7,2), new Pawn(Chessman.Color.Black), chessmen, board);
        addChessman(new Position(3,7,2), new Pawn(Chessman.Color.Black), chessmen, board);
        addChessman(new Position(4,7,2), new Pawn(Chessman.Color.Black), chessmen, board);
        addChessman(new Position(4,8,3), new Pawn(Chessman.Color.Black), chessmen, board);
        addChessman(new Position(5,8,3), new Pawn(Chessman.Color.Black), chessmen, board);
        
        return chessmen;
    }
}
