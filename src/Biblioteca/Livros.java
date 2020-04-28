package Biblioteca;

import javax.swing.JOptionPane;

public class Livros {

    private int codigo;
    private String descLivro;
    private Editora editora;

    public void infoLivro() {
        JOptionPane.showMessageDialog(null, "Informações sobre o livro\n"
                + "Codigo: " + this.codigo
                + "\nDescrição: " + this.getDescLivro());
    }

    public void infoEditora() {
        JOptionPane.showMessageDialog(null, "Informações sobre a editora\n"
                + "Cód: " + editora.getCodEditora()
                + "\nTelefone: " + editora.getTelefone());
    }

    public Livros(int cod, String desc, Editora ed) {
        this.codigo = cod;
        this.descLivro = desc;
        this.editora = ed;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescLivro() {
        return descLivro;
    }

    public void setDescLivro(String descLivro) {
        this.descLivro = descLivro;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

}
