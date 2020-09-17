package hw5.logger;

public class FileLogger implements Logger {

    @Override
    public void log(String message) {
            System.out.println("Log into console: " + message);
    }
}
