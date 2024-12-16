package Encapsulation;

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", "John Doe", 1000);

        account.displayAccountDetails();

        account.deposit(500);

        account.withdraw(300);

        try {
            account.withdraw(2000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        account.setAccountHolderName("Jane Doe");

        account.displayAccountDetails();

        System.out.println("Final Balance: " + account.getBalance());
    }
}
