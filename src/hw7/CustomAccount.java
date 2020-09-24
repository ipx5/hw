package hw7;

import hw7.exceptions.NotEnoughMoneyException;
import hw7.exceptions.UnknownAccountException;

import java.io.*;
import java.util.ArrayList;

public class CustomAccount extends Account implements AccountService {

    String path = "./src/hw7/storage.txt";

    private ArrayList<CustomAccount> accounts = new ArrayList<>();
    private static int currentId = 1;

    public ArrayList<CustomAccount> getAccounts() {
        return accounts;
    }

    public CustomAccount() throws IOException {
        super();
        File f = new File(path);
        if (!f.exists()) {
            String[] names = {"Иван", "Сергей", "Дмитрий", "Леонид", "Владислав", "Юля", "Мария", "Катя", "Карина", "Ирина"};
            for (String name : names) {
                accounts.add(new CustomAccount(currentId, name, rand()));
                currentId++;
            }
            fileWrite(path, accounts);
        }
        accounts = fileRead(f);
    }

    public CustomAccount(int id, String holder, int amount) {
        super(id, holder, amount);
    }

    private ArrayList<CustomAccount> fileRead(File f) throws IOException {
        ArrayList<CustomAccount> newListAccount = new ArrayList<>();
        FileReader fr = new FileReader(f);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while (line != null) {
            String[] data = line.split(" ");
            int id = Integer.parseInt(data[0]);
            String holder = data[1];
            int amount = Integer.parseInt(data[2]);
            newListAccount.add(new CustomAccount(id, holder, amount));
            line = reader.readLine();
        }
        return newListAccount;
    }

    private void fileWrite(String path, ArrayList<CustomAccount> listAccount) throws IOException {
        FileWriter fw = new FileWriter(path);
        for (CustomAccount account : listAccount) {
            int id = account.getId();
            String holder = account.getHolder();
            int amount = account.getAmount();
            fw.write(id + " " + holder + " " + amount + "\n");
        }
        fw.close();
    }

    @Override
    public void withdraw(int accountId, int amount) throws IOException {
        try {
            CustomAccount account = findAccount(accountId);
            if (account == null) {
                throw new hw7.exceptions.UnknownAccountException("Счет не найден");
            }
            if (account.getAmount() < amount) {
                throw new NotEnoughMoneyException();
            }
            account.setAmount(account.getAmount() - amount);
            System.out.println("Со счета " + accountId + " снято " + amount + ". Теперь там " + account.getAmount());
            fileWrite(path, accounts);
        } catch (hw7.exceptions.UnknownAccountException | NotEnoughMoneyException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void balance(int accountId) throws hw7.exceptions.UnknownAccountException {
        try {
            CustomAccount account = findAccount(accountId);
            if (account == null) {
                throw new hw7.exceptions.UnknownAccountException("Счет не найден");
            }
            System.out.println("Баланс " + account.getAmount());
        } catch (hw7.exceptions.UnknownAccountException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deposit(int accountId, int amount) throws IOException {
        try {
            CustomAccount account = findAccount(accountId);
            if (account == null) {
                throw new hw7.exceptions.UnknownAccountException("Счет не найден");
            }
            account.setAmount(account.getAmount() + amount);
            System.out.println("На счет " + accountId + " внесено " + amount + ". Теперь там " + account.getAmount());
            fileWrite(path, accounts);
        } catch (hw7.exceptions.UnknownAccountException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void transfer(int from, int to, int amount) throws IOException {
        CustomAccount accountFrom = findAccount(from);
        CustomAccount accountTo = findAccount(to);
        try {
            if (accountFrom == null) {
                throw new hw7.exceptions.UnknownAccountException("Счет " + from + " не найден");
            }
            if (accountTo == null) {
                throw new hw7.exceptions.UnknownAccountException("Счет " + to + " не найден");
            }
            if (accountFrom.getAmount() < amount) {
                throw new NotEnoughMoneyException();
            }
            accountFrom.setAmount(accountFrom.getAmount() - amount);
            accountTo.setAmount(accountTo.getAmount() + amount);
            System.out.println("Со счета " + from + " снято " + amount + ". Теперь там " + accountFrom.getAmount());
            System.out.println("На счет " + to + " внесено " + amount + ". Теперь там " + accountTo.getAmount());
            fileWrite(path, accounts);
        } catch (UnknownAccountException | NotEnoughMoneyException ex) {
            ex.printStackTrace();
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

    private CustomAccount findAccount(int id) {
        for (CustomAccount account : accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }
}


