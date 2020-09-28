
import exceptions.UnknownAccountException;

import java.io.IOException;
import java.sql.SQLException;

public interface AccountService {
    void withdraw(int accountId, int amount) throws IOException, SQLException;
    void balance(int accountId) throws UnknownAccountException, SQLException;
    void deposit(int accountId, int amount) throws IOException, SQLException;
    void transfer(int from, int to, int amount) throws IOException, SQLException;
}
