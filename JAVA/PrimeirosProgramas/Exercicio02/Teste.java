package Exercicio02;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Curso curso = new Curso();
        curso.SetandoNomeDoCurso();
        curso.SetandoHorario();
        Professor prof = new Professor();
        prof.CadastrarProfessor();
        curso.setProfessor(prof);

        /**Professor prof = new Professor();
        prof.setNome("Vladimir Svidrigailov");
        prof.setDepartamento("Defesa Contra a Arte das Trevas");
        prof.setEmail("vlad.svidrigailov@email.com");
        curso.setProfessor(prof);**/


        Aluno aluno01 = new Aluno();
        aluno01.Preencher();
        Aluno aluno02 = new Aluno();
        aluno02.Preencher();
        Aluno aluno03 = new Aluno();
        aluno03.Preencher();
        Aluno aluno04 = new Aluno();
        aluno04.Preencher();
        Aluno aluno05 = new Aluno();
        aluno05.Preencher();

        curso.setAluno(new Aluno[]{aluno01});
        curso.setAluno(new Aluno[]{aluno02});
        curso.setAluno(new Aluno[]{aluno03});
        curso.setAluno(new Aluno[]{aluno04});
        curso.setAluno(new Aluno[]{aluno05});

        aluno01.MotrarNotas();
        aluno02.MotrarNotas();
        aluno03.MotrarNotas();
        aluno04.MotrarNotas();
        aluno05.MotrarNotas();

        aluno01.MostrarAprovacao();
        aluno02.MostrarAprovacao();
        aluno03.MostrarAprovacao();
        aluno04.MostrarAprovacao();
        aluno05.MostrarAprovacao();





    }
}
