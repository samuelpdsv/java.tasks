package Exercicio02;

import java.util.Scanner;

public class Professor {

    private String nome;
    private String departamento;

    private String email;

    Scanner scan = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void CadastrarProfessor(){
        System.out.println("~~~~~~~~~~CADASTRO DE PROFESSOR~~~~~~~~~~");
        System.out.println("digite o nome: ");
        setNome(nome = scan.next());
        System.out.println("Digite o Departamento: ");
        setDepartamento(departamento = scan.next());
        System.out.println("Digite o Email: ");
        setEmail(email = scan.next());
    }
    public void MostrarProfessor(){
        System.out.println(getNome());
        System.out.println(getDepartamento());
        System.out.println(getEmail());
    }
}
