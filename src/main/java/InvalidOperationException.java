/**
 * Исключение, возникающее при передаче в калькулятор неверной операции
 */
public class InvalidOperationException extends RuntimeException {
    public InvalidOperationException(String message) {
        super( message );
    }
}
