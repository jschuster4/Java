public class Program {
    
    public static void main(String[] args)
    {
        BankAccount user1 = new BankAccount();
        BankAccount user2 = new BankAccount();
        // user1.Deposit(100, true);
        // user1.Deposit(200, false);
        // user1.Withdraw(50, true);
        // user1.Withdraw(50, false);
        // System.out.println(user1.getSavingsBalance());
        // System.out.println(user1.getCheckingBalance());
        // System.out.println("there are "+BankAccount.UserCount()+ " users");
        // System.out.println("the total amount stored between your accounts is "+user1.getTotal());
        System.out.println(user1.getAccountNumber());
    }
}
