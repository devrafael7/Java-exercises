
public class App {
    public static void main(String[] args) {
        SetUser new_user = new SetUser();

        new_user.CheckBalance();
        new_user.Deposit(20);
        new_user.Withdraw(5);
    }
}
