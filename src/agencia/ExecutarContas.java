package agencia;

import java.util.Scanner;

/**
 *
 * @author hrmbh
 */
public class ExecutarContas {

    public static void main(String[] args) {
       /* 
        Só pode existir conta especial, poupança ou universitária
        */ 
        
        ContaUniversitaria contaUni = new ContaUniversitaria();
        contaUni.setCurso("Sistemas de Informação");
        contaUni.setTitular("Anderson");
        System.out.println(contaUni.getCurso());
    }

}
