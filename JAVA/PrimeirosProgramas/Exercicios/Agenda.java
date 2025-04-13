package Exercicios;

import java.util.Scanner;

public class Agenda {

    Scanner scan = new Scanner(System.in);

    private String nome;
    private Contato[] contato;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContato() {
        return contato;
    }
    

    public void setContato(Contato[] contato) {
        this.contato = contato;
    }

    public void MostrarTodos(Contato[] contatos) {
        System.out.println("-=-=-=-=-=-=LISTA DE CONTATOS=-=-=-=-=-=-=-");
        System.out.println("-=-=-=-=-=-=Agenda de "+ nome +"=-=-=-=-=-=-=-");
        if (contatos != null && getContato() != null)
            for (Contato t : getContato()){
                System.out.println("Nome: [ "+t.getNome()+" ] Telefone: [ "+t.getTelefone() +" ] Email: [ "+ t.getEmail()+" ]");
            }
    }
}

