import java.lang.Math;

public class BankAccount {
    private double CheckingBalance;
    private double SavingsBalance;
    private static int NumUsers = 0;
    private String AccountNumber;
    private static double totalMoney = 0.0D;
    
    public BankAccount(double CheckingBalance, double SavingsBalance)
    {
        this.CheckingBalance = CheckingBalance;
        this.SavingsBalance = SavingsBalance;
        this.AccountNumber = BankAccount.generateNumber();
        NumUsers++;
        totalMoney += CheckingBalance + SavingsBalance;
    }

    public BankAccount()
    {
        this.CheckingBalance = 0;
        this.SavingsBalance = 0;
        this.AccountNumber = BankAccount.generateNumber();
        NumUsers++;
    }

    public static int UserCount()
    {
        return NumUsers;
    }

    public double getCheckingBalance() {
        return this.CheckingBalance;
    }

    public void setCheckingBalance(double CheckingBalance) {
        this.CheckingBalance = CheckingBalance;
    }

    public double getSavingsBalance() {
        return this.SavingsBalance;
    }

    public void setSavingsBalance(double SavingsBalance) {
        this.SavingsBalance = SavingsBalance;
    }

    public void Deposit(double number, boolean accountType){
        if (accountType == true){
            SavingsBalance += number;
            totalMoney += number; 
        }
        else{
            CheckingBalance += number;
            totalMoney += number;
        }
    }

    public void Withdraw(double number, boolean accountType){
        if (accountType == true && SavingsBalance < number){
            System.out.println("Insufficient funds in Savings account");
        }
        if (accountType == false && CheckingBalance < number){
            System.out.println("Insufficient funds in Checking account");
        }
        else{
            if (accountType == true){
                SavingsBalance -= number;
                totalMoney -= number;
            }
            else{
                CheckingBalance -= number;
                totalMoney -= number;
            }
        }
    }
    

    public double getTotal(){
        return CheckingBalance + SavingsBalance;
        //return totalMoney;
    }

    public static String generateNumber(){
        String AccountNum = "";
        int max = 9; 
        int min =0;
        while (AccountNum.length() != 10){
            int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
            String CurrentNum = String.valueOf(randomInt);
            AccountNum += CurrentNum;
        }
        return AccountNum;
    }

    public String getAccountNumber() {
        return this.AccountNumber;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }
}
