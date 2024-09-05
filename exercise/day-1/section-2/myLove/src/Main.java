//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        myBank account = new myBank("10213131");
        account.setAccountHolder("Kenny Geraldy Chandra");
        account.deposit(500);
        account.withdraw(100);
        System.out.println("Account Holder: "+account.getAccountHolder() + " Current Balance: " +account.getBalance());
    }
}