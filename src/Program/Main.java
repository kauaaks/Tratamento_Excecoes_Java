package Program;

import java.util.Scanner;
import java.util.Locale;
import Exceptions.DomainException;
import Model.Account;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();
            Account acc = new Account(number, holder, balance, withdrawLimit);
            System.out.println("====================");
            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();
            acc.Withdraw(amount);
        }
        catch (DomainException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}