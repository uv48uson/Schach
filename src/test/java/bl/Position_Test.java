package bl;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Position_Test {
    Position pos;
    
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    private int x,y,z;
    
    public Position_Test(int x, int y, int z, ExpectedException thrown){
        this.x = x;
        this.y = y;
        this.z = z;
        this.thrown = thrown;
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        return getPositions();
    }
    
    public static Collection<Object[]> getPositions(){
    	ExpectedException correct = ExpectedException.none();
        ExpectedException wrong = ExpectedException.none();
        wrong.expect(PositionOffBoardException.class);
    	return Arrays.asList(new Object[][] {
                {-1, 0, 0, wrong}, {3, -1, 1, wrong}, {1, 1, -1, wrong}, //negative values
                {1, 1, 6, wrong}, {1, 9, 6, wrong}, {1, 10, 3, wrong}, {6, 1, 0, wrong}, //to high numbers
                {1, 1, 1, correct}, {4, 0, 1, correct}, {2, 3, 0, correct}, {0, 5, 1, correct},
                {4, 4, 1, correct}, {1, 3, 3, correct}, {4, 3, 3, correct}, {4, 6, 2, correct},
                {1, 7, 3, correct}, {5, 6, 3, correct}, {1, 5, 5, correct}, {5, 5, 5, correct},
                {1, 7, 4, correct}, {0, 9, 5, correct}, {4, 8, 5, correct},
                {0, 0, 0, wrong}, {1, 0, 0, wrong}, {0, 1, 2, wrong}, {2, 3, 1, wrong},//wrong ones
                {4, 5, 0, wrong}, {4, 6, 1, wrong}, {1, 7, 2, wrong}, {2, 6, 3, wrong},
                {0, 4, 3, wrong}, {0, 5, 3, wrong}, {1, 4, 4, wrong}, {4, 6, 5, wrong}, 
                {4, 9, 4, wrong},
          });
    }
    
    @Test
    public void Position() throws PositionOffBoardException{
        pos = new Position(x, y, z);
    }
}
