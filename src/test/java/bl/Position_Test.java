package bl;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Before;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ui.I_UI_Impl;

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
        ExpectedException correct = ExpectedException.none();
        ExpectedException wrong = ExpectedException.none();
        wrong.expect(PositionOffBoardException.class);
        return Arrays.asList(new Object[][] {     
                 {-1, 0, 0, wrong}, {3, -1, 1, wrong}, {1, 1, -1, wrong},//negative values
                 {1, 1, 4, wrong}, {1, 9, 4, wrong}, {1, 10, 3, wrong}, {6, 1, 0, wrong},  //to high numbers
                 {0, 0, 0, wrong}, {0, 0, 2, wrong}, {2, 0, 0, wrong}, {2, 0, 1, wrong},  //line 0 (y = 0)
                 {0, 0, 1, correct}, {1, 0, 1, correct}, {1, 1, 1, correct}, {0, 1, 1, correct},  //AttackBoard Bottom Left
                 {5, 1, 0, wrong}, {0, 1, 0, wrong}, {2, 1, 1, wrong}, {1, 1, 2, wrong}, //line 1 (y = 1)
                 {5, 1, 1, correct}, {1, 1, 0, correct},
                 {1, 2, 1, wrong}, {0, 2, 0, wrong}, {2, 2, 1, wrong}, {1, 2, 3, wrong}, //line 2 (y = 2)
                 {1, 2, 2, correct}, {3, 2, 0, correct}, {5, 2, 2, correct},
                 {5, 3, 1, wrong}, {0, 3, 0, wrong}, {3, 3, 2, wrong}, {2, 3, 2, wrong}, //line 3 (y = 3)
                 {1, 3, 2, correct}, {1, 3, 0, correct}, {4, 3, 1, correct},
                 {5, 4, 1, wrong}, {0, 4, 0, wrong}, {0, 4, 2, wrong}, {3, 4, 2, wrong}, {2, 4, 3, wrong}, //line 4 (y = 4)
                 {1, 4, 3, correct}, {1, 4, 0, correct}, {4, 4, 1, correct}, {5, 4, 3, correct},
                 {5, 5, 0, wrong}, {0, 5, 1, wrong}, {0, 5, 2, wrong}, {3, 5, 0, wrong}, {3, 5, 3, wrong}, //line 5 (y = 5)
                 {1, 5, 3, correct}, {1, 5, 1, correct}, {4, 5, 2, correct}, {5, 5, 3, correct},
                 {5, 6, 0, wrong}, {0, 6, 1, wrong}, {0, 6, 2, wrong}, {3, 6, 0, wrong}, {3, 6, 3, wrong}, {1, 6, 3, wrong}, {5, 6, 3, wrong}, //line 6 (y = 6)
                 {1, 6, 1, correct}, {4, 6, 2, correct},
                 {5, 7, 0, wrong}, {0, 7, 1, wrong}, {0, 7, 2, wrong}, {3, 7, 0, wrong}, {3, 7, 3, wrong}, {1, 7, 3, wrong}, {5, 7, 3, wrong},{1, 7, 1, wrong},  //line 7 (y = 7)
                 {4, 7, 2, correct},
                 {5, 8, 0, wrong}, {0, 8, 1, wrong}, {0, 8, 2, wrong}, {3, 8, 0, wrong}, {3, 8, 3, wrong}, {1, 8, 1, wrong},  //line 8 (y = 8)
                 {4, 8, 2, correct}, {1, 8, 3, correct}, {5, 8, 3, correct},
                 {5, 9, 0, wrong}, {0, 9, 1, wrong}, {0, 9, 2, wrong}, {3, 9, 0, wrong}, {3, 9, 3, wrong}, {1, 9, 1, wrong}, {4, 9, 2, wrong},  //line 9 (y = 9)
                 {1, 9, 3, correct}, {5, 9, 3, correct},
           });
    }
    
    @Test
    public void Position() throws PositionOffBoardException{
        pos = new Position(x, y, z);
    }
}
