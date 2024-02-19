package net.texala.main;

 

import java.util.Scanner;

public class Account {
    private double balance;
    private String accountHolderName;
    private long accountNumber;

    public Account(String accountHolderName, long accountNumber, double initialAmount) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialAmount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");

            // Prompt for deposit in case of insufficient funds
            if (amount > 0) {
                System.out.println("Do you want to deposit to cover the shortfall? (y/n):");
                Scanner scanner = new Scanner(System.in);
                char userChoice = scanner.next().charAt(0);

                if (userChoice == 'y' || userChoice == 'Y') {
                    System.out.println("Enter the deposit amount:");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                }
            }
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account holder name for Account 1:");
        String accountHolderName1 = scanner.nextLine();

        System.out.println("Enter account number for Account 1:");
        long accountNumber1 = scanner.nextLong();

        System.out.println("Enter initial balance for Account 1:");
        double initialBalance1 = scanner.nextDouble();

        Account account1 = new Account(accountHolderName1, accountNumber1, initialBalance1);

        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter account holder name for Account 2:");
        String accountHolderName2 = scanner.nextLine();

        System.out.println("Enter account number for Account 2:");
        long accountNumber2 = scanner.nextLong();

        System.out.println("Enter initial balance for Account 2:");
        double initialBalance2 = scanner.nextDouble();

        Account account2 = new Account(accountHolderName2, accountNumber2, initialBalance2);

        System.out.println("Enter deposit amount for Account 1:");
        double depositAmount1 = scanner.nextDouble();
        account1.deposit(depositAmount1);

        System.out.println("Enter withdrawal amount for Account 2:");
        double withdrawalAmount2 = scanner.nextDouble();
        account2.withdraw(withdrawalAmount2);

        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());

        scanner.close();
    }
}
