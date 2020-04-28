package agencia;

public class ContaUniversitaria extends Conta{
    
    private String curso;
    
 
    public void imprimirTipoConta(){
        //Outro comportamento
        System.out.println("Conta Universitária");
    }
    
   
    public void ContaUniversitaria(Cliente c, String curso, int numConta, double saldo){
        this.cliente = c;
        this.curso = curso;
        this.numeroConta = numConta;
        this.saldo = saldo;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public boolean sacar(double valor) {
        if( valor > 10001){
            //universitário nao sacar mais do que 10000
            return false;
        }else {
            return true;
        }
    }
}
