package exceptions;

import java.io.IOException;

public class UnknownAccountException extends IOException {
    public UnknownAccountException (int accountId) {
        super("Счет " + accountId + " не найден");
    }
}
