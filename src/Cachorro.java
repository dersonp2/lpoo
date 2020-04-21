
public class Cachorro extends Animal{
    
    public void abanarRaboParaODono(){
    }
    //Assinatura = nome do método + lista de argumentos (parâmetros)
    
    //Sobrecarga de método
    //Lista de argumento que vai diferenciar
    public String emitirSom(String a){
        return "Oi";
    }
    
    public int emitirSom(int b){
        return 1;
    }
    
}
