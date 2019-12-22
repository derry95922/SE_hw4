import org.junit.Test;

import static org.junit.Assert.*;

public class letterGradeBoundaryTest {
    letterGrade Grade = new letterGrade();
    @Test
    public void gradeABoundary(){
        assertEquals('A',Grade.letterGrade(90));
        assertEquals('A',Grade.letterGrade(100));
    }

    @Test
    public void gradeBBoundary(){
        assertEquals('B',Grade.letterGrade(89));
        assertEquals('B',Grade.letterGrade(80));
    }

    @Test
    public void gradeCBoundary(){
        assertEquals('C',Grade.letterGrade(79));
        assertEquals('C',Grade.letterGrade(70));
    }

    @Test
    public void gradeDBoundary(){
        assertEquals('D',Grade.letterGrade(69));
        assertEquals('D',Grade.letterGrade(60));
    }

    @Test
    public void gradeFBoundary(){
        assertEquals('F',Grade.letterGrade(59));
        assertEquals('F',Grade.letterGrade(0));
    }

    @Test
    public void outOfRangeBoundary(){
        assertEquals('X',Grade.letterGrade(-1));
        assertEquals('X',Grade.letterGrade(101));
    }
}