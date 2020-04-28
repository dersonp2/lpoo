package agencia;

public class ContaPoupanca extends Conta {

    private double poupanca;

    @Override
    public void imprimirTipoConta(){
        //Outro comportamento
        System.out.println("Conta Poupança");
    }
    
    public void ContaPoupanca(Cliente c, int numConta, double saldo, double poupanca) {
        this.cliente = c;
        this.numeroConta = numConta;
        this.saldo = saldo;
        this.poupanca = poupanca;
        this.tipo = "Conta Poupança";
    }

    public double getPoupanca() {
        return poupanca;
    }

    public void depositarPoupanca(double valor) {
        if (valor > 0) {
            this.poupanca += valor;
        }
    }

    public boolean sacarPoupanca(double valor) {
        if (valor > 0) {
            if (this.poupanca >= valor) {
                this.poupanca -= valor;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor > saldo){
            System.out.println("Valor maior que o saldo");
            return false;
        } else{
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso");
            return true;
        }
    }
}
