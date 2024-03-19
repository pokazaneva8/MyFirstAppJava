package lr2.Task7;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(3500);
        System.out.println("Текущий баланс: " + myAccount.getBalance());
        myAccount.withdraw(555.5);
        System.out.println("Текущий баланс: " + myAccount.getBalance());
    }
}
