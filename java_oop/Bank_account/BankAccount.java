import java.lang.Math;

public class BankAccount {
    private double CheckingBalance;
    private double SavingsBalance;
    public static int NumUsers = 0;
    
    public BankAccount(double CheckingBalance, double SavingsBalance)
    {
        this.CheckingBalance = CheckingBalance;
        this.SavingsBalance = SavingsBalance;
        NumUsers++;
    }

    public BankAccount()
    {
        this.CheckingBalance = 0;
        this.SavingsBalance = 0;
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
        }
        else{
            CheckingBalance += number;
        }
    }

    public void Withdraw(double number, boolean accountType){
        if (SavingsBalance < number){
            System.out.println("Insufficient funds");
        }
        else{
            if (accountType == true){
                SavingsBalance -= number;
            }
            else{
                CheckingBalance -= number;
            }
        }
    }
    

    public double getTotal(){
        return CheckingBalance + SavingsBalance;
    }

    // public String randomNumber(){
    //     String AccountNum = "";
    //     for (int i=0;i<10; i++){
    //         double num = Math.random() * 10;
    //         String CurrentNum = String.valueOf(num);
    //         AccountNum += CurrentNum;
    //     }
    //     return AccountNum;
    // }
}
