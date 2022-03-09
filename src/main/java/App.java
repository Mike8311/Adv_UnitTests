import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner( System.in )) {
            IOOperations ioOperations = new IOOperations(scanner);

            double d1 = ioOperations.inputDouble();
            double d2 = ioOperations.inputDouble();
            String operation = ioOperations.inputOperation();

            try {
                Calculator calculator = new Calculator();
                double result = calculator.calculate( d1, d2, operation );
                ioOperations.outputResult( result );
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
