import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {
    private static final double DELTA = 1e-15;

    @Test
    public void AdditionShouldReturnSum() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate( 2.8, 1.4, "+" );
        Assert.assertEquals( 4.2, result,  DELTA);
    }

    @Test
    public void SubtractionShouldReturnDelta() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate( 2.8, 1.4, "-" );
        Assert.assertEquals( 1.4, result,  DELTA);
    }

    @Test
    public void DivisionShouldReturnDiv() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate( 2.8, 1.4, "/" );
        Assert.assertEquals( 2, result,  DELTA);
    }

    @Test
    public void MultiplicationShouldReturnMul() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate( 2.8, 1.4, "*" );
        Assert.assertEquals( 3.92, result,  DELTA);
    }

    @Test(expected = InvalidOperationException.class)
    public void InvalidOperationShouldThrowException() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate( 2.8, 1.4, "aa" );
    }
}
