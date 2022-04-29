package Junitdemo;
import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorDemo {
    private final Calculator calculator = new Calculator();
    
//-------------------------------------------------------------------
    @Test
    public void testAddition(){

        var actualResult = calculator.add(1,1);

        assertEquals(2,actualResult);

    }
//-------------------------------------------------------------------
    @Test
    public void testAddition2(){

        var actualResult = calculator.add(-20,1);

        assertEquals(-19,actualResult);


    }
//---------------------------------------------------------------------

}
