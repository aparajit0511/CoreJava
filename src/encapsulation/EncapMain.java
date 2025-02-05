package encapsulation;

public class EncapMain {
    public static void main(String[] args) {
        ImplEncapsulation encap = new ImplEncapsulation();
        encap.setAge(10);
        System.out.println(encap.getAge());

        BankEncap bank = new BankEncap();
        bank.setBankBalance(20.00);
        bank.withdraw(10.00);
        System.out.println("Balance left after withdrawl "+ bank.getBankBalance());
    }
}
