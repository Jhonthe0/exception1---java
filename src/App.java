import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Number: ");
            Integer number = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Holder: ");
            String holder = entrada.nextLine();

            System.out.println("Initial Balance: ");
            Double balance = entrada.nextDouble();

            System.out.println("Withdraw limit: ");
            Double withdrawLimit = entrada.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.println("Enter amount for withdraw:");
            double amount = entrada.nextInt();

            account.withdraw(amount);
            System.out.println("New balance:" + account.getBalance());

            entrada.close();
        } catch (DomainException e) {
            System.out.println("Withdraw error:" + e.getMessage());
        }
    }
}
