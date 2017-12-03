package core.threads;

public class Conta {

    private int saldo = 50;

    public Conta() {
    }

    public int getSaldo() {
        return saldo;
    }

    public void saque(int valor){
        saldo -= valor;

    }
}
