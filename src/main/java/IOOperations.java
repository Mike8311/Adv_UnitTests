import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ввод чисел и вывод результата
 */
public class IOOperations {
    private final Scanner scanner;
    private boolean firstInput = true;
    private String operation;

    public IOOperations(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Ввод дробного числа с консоли
     * @return введенное число
     */
    public double inputDouble() {
        if (firstInput) {
            System.out.print( "Введите дробное число: " );
        } else System.out.print( "И еще одно: " );

        try {
            double result = scanner.nextDouble();
            firstInput = false;
            return result;
        } catch (InputMismatchException e) {
            System.out.println("Необходимо ввести дробное число! Повторите ввод");
            scanner.next();
            return inputDouble();
        }
    }

    /**
     * Ввод операции калькулятора с консоли
     * @return операция калькулятора
     */
    public String inputOperation() {
        System.out.println( "Введите операцию калькулятора (+,-,/,*): " );
        String result = scanner.next();

        if (!"+-/*".contains( result) ) {
            System.out.println( "Операция введена неверно! Повторите ввод" );
            inputOperation();
        }

        operation = result;
        return result;
    }

    /**
     * Вывод результата операции на консоль
     * @param result результат
     */
    public void outputResult(double result) {
        System.out.printf( "Выбрана операция %s %n", operation );
        System.out.printf( "Результат вычисления: %.4f %n", result );
    }
}
