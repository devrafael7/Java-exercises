public class SetUser {
    UserBalance user_balance = new UserBalance(0);

    public void CheckBalance(){
        System.out.println(user_balance);
    }

    public void Deposit(double deposit_value){
        user_balance.setDeposit(deposit_value);
        System.out.println(user_balance);
    }

    public void Withdraw(double withdraw_value){
        System.out.println(user_balance);
    }

   
}