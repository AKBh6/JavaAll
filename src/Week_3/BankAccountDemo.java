
package Week_3;

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String name;
    int balance;
    final int minBalance = 100;

    private boolean checkMinBalance(int amount) {
        if (balance - amount <= minBalance) {
            return false;
        }
        else {
            return true;
        }
    }

    public BankAccount(int accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public void balance() {
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(int amount) {
        if (checkMinBalance(amount)) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        }
        else {
            System.out.println("Transaction failed");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        int balance = sc.nextInt();

        BankAccount b = new BankAccount(accountNumber, name, balance);

        System.out.print("Enter Deposit Amount: ");
        int amt = sc.nextInt();

        b.deposit(amt);

        System.out.println("\n===== ACCOUNT DETAILS =====");
        System.out.println("Account Number: " + b.accountNumber);
        System.out.println("Account Holder: " + b.name);
        b.balance();

        System.out.print("\nEnter Withdrawal Amount: ");
        int amnt1 = sc.nextInt();

        b.withdraw(amnt1);
        b.balance();

        sc.close();
    }
}
