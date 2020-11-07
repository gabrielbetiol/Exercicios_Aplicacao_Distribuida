import java.util.ArrayList;

public class Conta {

    private double saldo;
    private double numero;
    private double limite;
    private ArrayList<Titular> titular = new ArrayList<Titular>();

    public Conta(double saldo, double numero, double limite, Titular titular) {
        this.saldo = saldo;
        this.numero = numero;
        this.limite = limite;
        this.titular.add(titular);
    }

    public Conta(double saldo, double numero, double limite, ArrayList<Titular> titular) {
        this.saldo = saldo;
        this.numero = numero;
        this.limite = limite;
        this.titular = titular;
    }

    public void saque(double valor) {
        if (valor > this.getSaldo()) {
            System.out.println("Nao eh possivel sacar, saldo insuficiente!");
        } else {
            this.setSaldo(this.getSaldo() - valor);
        }
    }

    public void deposito(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Deposito realizado com sucesso!");
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getNumero() {
        return numero;
    }

    private void setNumero(double numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    private void setLimite(double limite) {
        this.limite = limite;
    }

    public ArrayList<Titular> getTitular() {
        return titular;
    }

    public void setTitular(ArrayList<Titular> titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", numero=" + numero +
                ", limite=" + limite +
                ", titular=" + titular +
                '}';
    }
}
