package lr2.Task7;

public class BankAccount implements Bank {
    private double account;
    @Override
    public void deposit(double amount) {
        account += amount;
        System.out.println("Счёт пополнен на сумму: " + amount);
    }
    @Override
    public void withdraw(double amount) {
        if (account < amount){
            System.out.println("На счёте недостаточно средств. ");
        } else {
            account -= amount;
            System.out.println("Со счёта сняли сумму: " + amount);
        }
    }
    @Override
    public double getBalance() {
        return account;
    }
}