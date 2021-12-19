package code._4_student_effort._2_Bank_transactions;

public class BankAccount
{
    private String name;
    private int debit;
    public BankAccount(String name,int debit)
    {
        this.name=name;
        this.debit=debit;
    }
    public void withdraw(int amount)
    {
        simulateLongDatabaseCall();
        if(debit>=amount)
            debit=debit-amount;
        else
            System.out.println("There are not enough money in this bank");
    }
    public void deposit(int amount)
    {
        simulateLongDatabaseCall();
        debit=debit+amount;
    }
    public void simulateLongDatabaseCall()
    {
        try{
            Thread.sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
