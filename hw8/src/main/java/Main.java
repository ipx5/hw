import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {

        CustomAccount customAccount = new CustomAccount();
        boolean cont = true;
        while (cont) {
            System.out.println("Введите команду");
            Scanner scanner = new Scanner(System.in);
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]) {
                case "balance": {
                    customAccount.balance(Integer.parseInt(command[1]));
                    break;
                }
                case "withdraw": {
                    customAccount.withdraw(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                }
                case "deposit": {
                    customAccount.deposit(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                }
                case "transfer": {
                    customAccount.transfer(Integer.parseInt(command[1]), Integer.parseInt(command[2]), Integer.parseInt(command[3]));
                    break;
                }
                case "q": {
                    cont = false;
                    break;
                }
            }
        }
    }
}

