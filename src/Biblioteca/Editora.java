package Biblioteca;

public class Editora {

    private int codEditora;
    private String telefone;

    public Editora(int codEditora, String telefone) {
        this.codEditora = codEditora;
        this.telefone = telefone;

    }

    public int getCodEditora() {
        return codEditora;
    }

    public void setCodEditora(int codEditora) {
        this.codEditora = codEditora;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
