package hw5.logger;

public class DbLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.printf("Log into database: " + message);
    }
}
