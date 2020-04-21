package agencia;


// Classe para servir modelo
// Não pode ser instancia
public abstract class Conta {
 
    protected String titular;
    protected int numeroConta;
    protected double saldo;
    protected String tipo;
    protected String local;

    //Métodos com o mesmo nome
    //Porém com assinatura e comportamento diferentes
    public void imprimirTipoConta() {
        System.out.println("Conta");
    }

    public void imprimirTipoConta(String texto) {
        System.out.println("Conta " + texto);
    }

    public String mostrar() {
        //Comportamento
        return "a";
    }

    public String mostrar(String a) {
        //Comportamento
        return "b";
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public  abstract boolean sacar(double valor);

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
