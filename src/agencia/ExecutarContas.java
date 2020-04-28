package agencia;

import java.util.Scanner;

/**
 *
 * @author hrmbh
 */
public class ExecutarContas {

    public static void main(String[] args) {
//        Criar o cliente
        Cliente c = new Cliente();
        c.setNome("Anderson");
        c.setCpf("607.854.987-78");
        c.setTelefone("(98)987657478");
        
        Cliente c2 = new Cliente();
        c2.setNome("Ladislau");
        c2.setCpf("798.584.984-88");
        c2.setTelefone("(98)91466985");
        
        ContaEspecial ce = new ContaEspecial();
        ce.setNumeroConta(895);
        ce.setLimite(200);
        ce.setSaldo(1000);
        ce.setCliente(c2);
        
        System.out.println("Dados da conta: \nNumero: " + ce.getNumeroConta()+
                "\nLimite: "+ ce.getLimite() +
                "\nCliente: " + ce.cliente.getNome());
        

    }

}
