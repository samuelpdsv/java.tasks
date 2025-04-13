package Exercicio02;

import java.util.Scanner;

public class Aluno {
    Scanner scan = new Scanner(System.in);

    private String nome;
    private int matricula;
    private double[] notas;
    public void Preencher(){
        System.out.println("=-=-=-=-=-PREENCHIMENTO DE DADOS DO ALUNO-=-=-=-=-=-=-=-");
        System.out.println("digite seu nome: ");
        setNome(nome = scan.next());
        System.out.println("digite sua matricula: ");
        setMatricula(matricula = scan.nextInt());
        System.out.println("-=-=-=-=-=-PREENCHIMENTO DO QUADRO DE NOTAS-=-=-=-=-=-=-");
        System.out.println("-=-=-=Aluno: [ "+ nome +" ] Matricula: [ "+matricula+" ]-=-=-=-=-=-=-");

        double[] notas = new double[4];

        System.out.println("primeira nota: ");
        notas[0] = scan.nextDouble();
        System.out.println("segunda nota: ");
        notas[1] = scan.nextDouble();
        System.out.println("Terceira nota: ");
        notas[2] = scan.nextDouble();
        System.out.println("Quarta nota: ");
        notas[3] = scan.nextDouble();

        setNotas(notas);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=--=-=-=");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public void MotrarNotas(){
        System.out.println("**************QUADRO DE NOTAS****************");
        System.out.println("*******Aluno: [ "+nome+" ] Matricula: [ "+matricula+" ]**********");
        System.out.println("primeira nota: ("+notas[0]+")");
        System.out.println("segunda nota: ("+notas[1]+")");
        System.out.println("terceira nota: ("+notas[2]+")");
        System.out.println("quarta nota: ("+notas[3]+")");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("---------MÉDIA: [ "+media()+" ] ----------------");
        System.out.println("***********************************************");
    }
    public double media(){
        double media = ((notas[0] + notas[1] + notas[2] + notas[3])/4);
        return media;
    }
    public String Situacao() {
        String situacao;
        if (media() >= 7) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }
        return situacao;
    }
    public void MostrarAprovacao(){
        System.out.println("Aluno: ["+nome+"] Média: ["+media()+"] Situação: ["+Situacao()+"]");
    }


}
