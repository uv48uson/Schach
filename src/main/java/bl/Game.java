package bl;

import java.util.ArrayList;
import java.util.Collection;

import ui.I_UI;
import bl.dataElements.MainBoard;
import bl.dataElements.Board;
import bl.dataElements.Chessman;
import bl.dataElements.King;
import bl.dataElements.OverAllBoard;
import bl.dataElements.Queen;
import bl.dataElements.AttackBoard;

public class Game {
    I_UI ui;

    Scoreboard score;
	Board board;
	Player[] players = new Player[2];
	
	public Game(I_UI ui) throws Exception{
	    this.ui = ui;
	    Board board = new OverAllBoard();
	    score = new Scoreboard(board);
	    
	    Collection<Chessman> whiteChessmen = new ArrayList<Chessman>();
	    Collection<Chessman> blackChessmen = new ArrayList<Chessman>();
	    
	    
        ChessmenInitialisator.initializeNormalGame(blackChessmen, whiteChessmen, board);
	    
	    players[0] = new Person(whiteChessmen, board);
	    players[1] = new KI(blackChessmen, board);
	}

	public void play() {
	    int i = 0;
	    while(true){
	        if(i == 10){
	            return;
	        }
	        players[0].performMove();
	        if(score.isCheckMate(players[1])){
	            ui.announceWinner(players[0]);
	            return;
	        }
	        
	        players[1].performMove();
            if(score.isCheckMate(players[0])){
                ui.announceWinner(players[1]);
                return;
            }
            i++;
	    }
	}

	public void configureChessmen(Board board){
	    
	    
	    
	}

    public Board getBoard() {
        return board;
    }
}