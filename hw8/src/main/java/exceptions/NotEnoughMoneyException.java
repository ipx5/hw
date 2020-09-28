package exceptions;

import java.io.IOException;


public class NotEnoughMoneyException extends IOException {
    public NotEnoughMoneyException(int from) {
        super("На счете недостаточно денег");
    }
}