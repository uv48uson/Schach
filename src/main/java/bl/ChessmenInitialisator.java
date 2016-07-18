package bl;

import java.nio.charset.CoderMalfunctionError;
import java.util.ArrayList;
import java.util.Collection;

import bl.dataElements.Bishop;
import bl.dataElements.Board;
import bl.dataElements.Chessman;
import bl.dataElements.OverAllBoard;
import bl.dataElements.Pawn;
import bl.dataElements.PositionOccupiedException;
import bl.dataElements.Queen;
import bl.dataElements.Rook;

public class ChessmenInitialisator {
//    final static int NUMBER_PLAYERS = 2;
//    
//    public static Player[] initializeNormalGame(){
//        Player[] players = new Player[NUMBER_PLAYERS];
//        
//        Board board = new OverAllBoard(players);
//
//        Scoreboard score = new Scoreboard(players, board);
//        
//        Collection<Chessman> blackChessmen = initializeChessmen(board, Chessman.Color.Black);
//        Collection<Chessman> whiteChessmen = initializeChessmen(board, Chessman.Color.White);
//        
//        players[0] = new KI(blackChessmen, board, score);
//        players[1] = new Person(whiteChessmen, board);
//        
//        return players;
//    }
//
//    private static Collection<Chessman> initializeChessmen(Board board, Chessman.Color color){
//        Collection<Chessman> chessmen = new ArrayList<Chessman>();
//        
//        try{
//            addChessman(new Position(0,0,1), new Rook(color), chessmen, board);
//            addChessman(new Position(1,0,1), new Queen(color), chessmen, board);
//            addChessman(new Position(1,1,0), new Kight(color), chessmen, board);
//            addChessman(new Position(2,1,0), new Bishop(color), chessmen, board);
//            addChessman(new Position(3,1,0), new Bishop(color), chessmen, board);
//            addChessman(new Position(4,1,0), new Kight(color), chessmen, board);
//            addChessman(new Position(4,0,1), new King(color), chessmen, board);
//            addChessman(new Position(5,0,1), new Rook(color), chessmen, board);
//            
//            addChessman(new Position(0,1,1), new Pawn(color), chessmen, board);
//            addChessman(new Position(1,1,1), new Pawn(color), chessmen, board);
//            addChessman(new Position(1,2,0), new Pawn(color), chessmen, board);
//            addChessman(new Position(2,2,0), new Pawn(color), chessmen, board);
//            addChessman(new Position(3,2,0), new Pawn(color), chessmen, board);
//            addChessman(new Position(4,2,0), new Pawn(color), chessmen, board);
//            addChessman(new Position(4,1,1), new Pawn(color), chessmen, board);
//            addChessman(new Position(5,1,1), new Pawn(color), chessmen, board);   
//        }catch(PositionOffBoardException| PositionOccupiedException ex){
//            throw new CoderMalfunctionError(ex);
//        }
//        
//        return chessmen;
//    }
//    
//    private static void addChessman(Position position, Chessman chessman, Collection<Chessman> chessmen, Board board) throws PositionOffBoardException, PositionOccupiedException{
//        chessmen.add(chessman);
//        board.setChessman(position, chessman);
//    }
}
