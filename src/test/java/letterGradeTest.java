import org.junit.Test;

import static org.junit.Assert.*;

public class letterGradeTest {
    letterGrade Grade = new letterGrade();

    @Test
    public void gradeA(){
        assertEquals('A',Grade.letterGrade(95));
    }

    @Test
    public void gradeB(){
        assertEquals('B',Grade.letterGrade(85));
    }

    @Test
    public void gradeC(){
        assertEquals('C',Grade.letterGrade(75));
    }

    @Test
    public void gradeD(){
        assertEquals('D',Grade.letterGrade(65));
    }

    @Test
    public void gradeF(){
        assertEquals('F',Grade.letterGrade(20));
    }

    @Test
    public void outOfRange(){
        assertEquals('X',Grade.letterGrade(-10));
        assertEquals('X',Grade.letterGrade(1001));
    }
}