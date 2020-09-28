import exceptions.NotEnoughMoneyException;
import exceptions.UnknownAccountException;
import org.h2.jdbc.JdbcSQLException;
import java.io.*;
import java.sql.*;

public class CustomAccount extends Account implements AccountService {

    private static int currentId = 1;
    private static String sql = null;
    private static Connection connection = null;
    private static Statement statement = null;
    private static PreparedStatement prepareStatement = null;


    public CustomAccount() throws IOException, SQLException {
        super();
        sql = "INSERT INTO ACCOUNTS (id, holder, amount) VALUES (?, ?, ?)";
        connection = DriverManager.getConnection("jdbc:h2:mem:test;INIT=RUNSCRIPT FROM 'hw8/src/main/resources/accounts.sql'");
        connection.setAutoCommit(false);
        prepareStatement = connection.prepareStatement(sql);
        String[] names = {"Иван", "Сергей", "Дмитрий", "Леонид", "Владислав", "Юля", "Мария", "Катя", "Карина", "Ирина"};
        for (String name : names) {
            prepareStatement.setInt(1, currentId);
            prepareStatement.setString(2, name);
            prepareStatement.setInt(3, rand());
            prepareStatement.addBatch();
            currentId++;
        }
        prepareStatement.executeBatch();
    }

    @Override
    public void withdraw(int accountId, int amount) throws IOException, SQLException {
        Integer amountAccountNow = amountAccount(accountId);
        if (amountAccountNow == null) {
            throw new UnknownAccountException(accountId);
        }
        int amountNew = amountAccountNow - amount;
        sql = "UPDATE ACCOUNTS SET amount = " + amountNew + " WHERE id = " + accountId;
        statement.execute(sql);
        System.out.println("Со счета " + accountId + " снято " + amount + ", теперь там " + amountNew);
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException, SQLException {
        Integer amountAccount = amountAccount(accountId);
        if (amountAccount == null) {
            throw new UnknownAccountException(accountId);
        }
        System.out.println("Баланс " + amountAccount);
    }

    @Override
    public void deposit(int accountId, int amount) throws IOException, SQLException {
        Integer amountAccountNow = amountAccount(accountId);
        if (amountAccountNow == null) {
            throw new UnknownAccountException(accountId);
        }
        sql = "UPDATE ACCOUNTS SET amount = amount +" + amount + " WHERE id = " + accountId;
        statement.execute(sql);
        System.out.println("Счет " + accountId + " пополнен на " + amount + ", теперь там " + (amountAccountNow + amount));

    }

    @Override
    public void transfer(int from, int to, int amount) throws IOException, SQLException {
        Integer amountAccountFrom = amountAccount(from);
        Integer amountAccountTo = amountAccount(to);
        if (amountAccountFrom == null) {
            throw new UnknownAccountException(from);
        }
        if (amountAccountTo == null) {
            throw new UnknownAccountException(to);
        }
        if (amountAccountFrom < amount) {
            throw new NotEnoughMoneyException(from);
        }
        sql = "UPDATE ACCOUNTS SET amount = amount -" + amount + " WHERE id = " + from;
        statement.execute(sql);
        sql = "UPDATE ACCOUNTS SET amount = amount +" + amount + " WHERE id = " + from;
        statement.execute(sql);
        System.out.println("Со счета " + from + " снято " + amount + ". Теперь там " + (amountAccountFrom - amount));
        System.out.println("На счет " + to + " внесено " + amount + ". Теперь там " + (amountAccountTo + amount));
    }


    public void all() throws SQLException {
        sql = "SELECT * FROM ACCOUNTS";
        prepareStatement = connection.prepareStatement(sql);
        ResultSet resultSet = prepareStatement.executeQuery();
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String holder = resultSet.getString(2);
            int amount = resultSet.getInt(3);
            System.out.println(id + " " + holder + " " + amount);
        }
    }

    private int rand() {
        while (true) {
            int number = (int) (Math.random() * 100000);
            if (number < 0) {
                continue;
            }
            return number;
        }
    }

    private Integer amountAccount(int accountId) throws SQLException {
        try {
            sql = "SELECT amount FROM ACCOUNTS WHERE id = " + accountId;
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            return resultSet.getInt(1);
        } catch (JdbcSQLException ex) {
            return null;
        }
    }
}


