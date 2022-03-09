/**
 * Калькулятор для выполнения арифметических операций с дробными числами
 */
public class Calculator {

    /**
     * Выполнение операции
     * @param d1 первое число
     * @param d2 второе число
     * @param operation операция
     * @return результат
     */
    public double calculate(double d1, double d2, String operation)  {
        switch (operation) {
            // Сложение
            case "+":
                return addition( d1, d2 );
            // Вычитание
            case "-":
                return subtraction( d1, d2 );
            // Деление
            case "/":
                return division( d1, d2 );
            // Умножение
            case "*":
                return multiplication( d1, d2 );
            default:
                throw new InvalidOperationException(String.format( "Операция неверно введена: %s", operation ));
        }
    }

    /**
     * Сложение двух дробных чисел
     * @param d1 первое число
     * @param d2 второе число
     * @return результ
     */
    private double addition(double d1, double d2) {
        return d1 + d2;
    }

    /**
     * Вычитание двух дробных чисел
     * @param d1 первое число
     * @param d2 второе число
     * @return результ
     */
    private double subtraction(double d1, double d2) {
        return d1 - d2;
    }

    /**
     * Деленеие двух дробных чисел
     * @param d1 первое число
     * @param d2 второе число
     * @return результ
     */
    private double division(double d1, double d2) {
        return d1 / d2;
    }

    /**
     * Умножение двух дробных чисел
     * @param d1 первое число
     * @param d2 второе число
     * @return результ
     */
    private double multiplication(double d1, double d2) {
        return d1 * d2;
    }
}
