public class UserBalance {
    double balance;

    public UserBalance(double user_balance) {
        this.balance = user_balance;
    }

    public double getBalance() {
        return balance;
    }

    public double setDeposit(double deposit_value) {
        double setDepositResult = this.balance += deposit_value;
        return setDepositResult;
    }

    public double setWithDraw(double withdraw_value) {
        if (withdraw_value > balance) {
            withdraw_value = 0;
        } 
        double setWithDrawResult = this.balance -= withdraw_value;
        return setWithDrawResult;
    }

    @Override
    public String toString() {
        return "Current Balance: $" + balance;
    }

}