package entities;

public class Conta {

    private int number;
    private String holder;
    private double balence;

    //A conta possui um deposito inicial
    public Conta(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    //A conta não tem deposito inical
    public Conta(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalence() {
        return balence;
    }

    public void deposit(double amount) {
        this.balence += amount;
    }

    public void withdraw(double amount) {
        this.balence -= amount + 5.0;
    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balence);
    }

}
