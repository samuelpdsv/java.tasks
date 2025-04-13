package entidade;

import java.util.Scanner;

public abstract class FiguraGeometrica {
    private String nome;
    private String cor;

    public Scanner scan = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
