import static org.junit.Assert.*;

import Calc.Main;
import org.junit.Test;
public class newTest {
    private static final double DELTA = 1e-15;
    Main calculator = new Main();
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 6, calculator.fact(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, calculator.fact(4), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 120, calculator.fact(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, calculator.fact(3), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 8, calculator.getPower(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 64, calculator.getPower(4, 3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, calculator.getPower(2, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, calculator.getPower(2, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, calculator.getNaturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, calculator.getNaturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 6, calculator.getNaturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, calculator.getNaturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive(){
        assertEquals("Finding square root for True Positive", 2, calculator.getSquareRoot(4), DELTA);
        assertEquals("Finding square root for True Positive", 1, calculator.getSquareRoot(1), DELTA);
    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, calculator.getSquareRoot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, calculator.getSquareRoot(4), DELTA);

    }

}
