package agencia;

public class ContaEspecial extends Conta {
    private double limite;

    
    //Mesma nomeclatura da classe Mãe
    
    //Método é uma sobreposição
    //Método é da classe Conta
    //Adicionando um comportamento diferente
    @Override //Sobrepor
    public void imprimirTipoConta(){
        //Outro comportamento
        System.out.println("Conta Especial");
    }
    
    
    
    public void ContaEspecial(Cliente c, int numConta, double saldo, double limite) {
        this.cliente = c;
        this.numeroConta = numConta;
        this.saldo = saldo;
        this.limite = limite;
        this.tipo = "Conta Especial";
    }

    public String saqueEspecial(double valor) {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                return "Saque realizado com sucesso";
            } else {
                double diferenca = Math.abs(valor - this.saldo);
                if (diferenca <= limite) {
                    this.saldo -= valor;
                    return "Saque realizado com sucesso. SALDO NEGADTIVO. Mais R$ "+diferenca+" serão adicionados em faturas futuras";
                } else {
                    return "Falha no saque. Limite excedido";
                }
            }
        }
        return null;
    }
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    //Implementação de um método abstrato
    @Override
    public boolean sacar(double valor) {
      this.saldo = valor;
      return true;
    }

}
