package Exercicio02;

import java.util.Scanner;

public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] aluno;

    Scanner scan = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public void SetandoNomeDoCurso(){
        System.out.println("*************DIGITE O NOME DO CURSO*********** ");
        setNome(nome = scan.next());
    }
    public void SetandoHorario(){
        System.out.println("Horário do curso:  ");
        setHorario(horario = scan.next());
    }
}
