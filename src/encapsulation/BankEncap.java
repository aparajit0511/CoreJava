package encapsulation;

public class BankEncap {
    private int accountNumber;
    private double bankBalance;

    public void setBankBalance(double money){
        this.bankBalance = money;
    }

    public void withdraw(double money){
        this.bankBalance = this.bankBalance - money;
    }

    public double getBankBalance(){
        return this.bankBalance;
    }


}
