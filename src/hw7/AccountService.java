package hw7;

import hw7.exceptions.UnknownAccountException;

import java.io.IOException;

public interface AccountService {
    void withdraw (int accountId, int amount) throws IOException;
    void balance (int accountId) throws UnknownAccountException;
    void deposit (int accountId, int amount) throws IOException;
    void transfer (int from , int to, int amount) throws IOException;
}
