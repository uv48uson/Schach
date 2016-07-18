package bl;

import java.util.Collection;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import bl.dataElements.Bishop;
import bl.dataElements.Board;
import bl.dataElements.Chessman;
import bl.dataElements.Chessman.Color;
import bl.dataElements.OverAllBoard;
import bl.dataElements.PositionOccupiedException;

@RunWith(Parameterized.class)
public class Board_Test {
	Board board = new OverAllBoard(null);

	@Rule
    public ExpectedException thrown = ExpectedException.none();
    private int x,y,z;
    
    public Board_Test(int x, int y, int z, ExpectedException thrown){
        this.x = x;
        this.y = y;
        this.z = z;
        this.thrown = thrown;
    }

	@Parameters
	public static Collection<Object[]> data() {
		return Position_Test.getPositions();
	}

	@Test
	public void test_setChessman() throws PositionOffBoardException, PositionOccupiedException{
		Position position = new Position(x,y,z);
		Chessman chessman = new Bishop(Color.Black);

		board.setChessman(position, chessman);
		
		assert(chessman == board.getChessman(position));
	}
	
	@Test
	public void test_isOccupied() throws PositionOffBoardException, PositionOccupiedException{
		Position position = new Position(x,y,z);
		Chessman chessman = new Bishop(Color.Black);

		board.setChessman(position, chessman);
		assert(board.isOccupied(position));
	}
	
	@Test
	public void test_filterAttackedMoves(){
		
	}
}
