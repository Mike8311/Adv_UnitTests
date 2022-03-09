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
            firstInput = false;
        } else System.out.print( "И еще одно: " );
        return scanner.nextDouble();
    }

    /**
     * Ввод операции калькулятора с консоли
     * @return операция калькулятора
     */
    public String inputOperation() {
        System.out.print( "Введите операцию калькулятора (+,-,/,*): " );
        String result = scanner.next();

        if (!"+-/*".contains( result) ) {
            System.out.print( "Операция введена неверно, повторите ввод (+,-,/,*): " );
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
