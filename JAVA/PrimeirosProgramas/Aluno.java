import java.util.Objects;
import java.util.Scanner;

public class Aluno {

    String nome;
    int matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notas = new double[3][3];

    double CalcularNotas(double[][] notas) {
        System.out.println("****************VERIFICADOR DE APROVAÇÃO.****************");
        double somaMaior = 0;
        for (int i = 0; i < notas.length; i++){
            for (int j = 0; j < notas[i].length; j++){
                somaMaior += notas[i][j];

            }
        }
        double avaliacao = somaMaior/9;

        if (avaliacao >= 7){
            System.out.println("Aluno aprovados. Média Geral: "+ avaliacao);
        } else{
            System.out.println("Aluno reprovado. Média Geral: "+avaliacao );
        }
    return somaMaior;
    }

    double CalcularNotasMateria(double[][] notas, String[] disciplinas){
        System.out.println("***********APROVAÇÃO EM CADA MATÉRIA*****************");

        double soma01 = 0;
        double soma02 = 0;
        double soma03 = 0;
        for(int i = 0; i< notas.length; i++){
            for (int j = 0; j < notas.length; j++ ){
                if (i == 0){
                    soma01 += notas[i][j];
                } else if (i == 1){
                    soma02 += notas[i][j];
                } else if (i == 2) {
                    soma03 += notas[i][j];
                }
            }
        }
        double nota01 = soma01/3;
        double nota02 = soma02/3;
        double nota03 = soma03/3;

        if (nota01 >=7 ){
            System.out.println("MATÉRIA: " + disciplinas[0] + ". NOTA FINAL: " + String.format("%.2f", nota01) + ". situação: APROVADO"  );
            System.out.println("Notas: -- "+ notas[0][0] +" -- " + notas[0][1] + " -- " + notas[0][2] + " -- ");
        }else {
            System.out.println("MATÉRIA: " + disciplinas[0] + ". NOTA FINAL: "+ String.format("%.2f", nota01) + ". situação: REPROVADO"  );
            System.out.println("Notas: -- "+ notas[0][0] +" -- " + notas[0][1] + " -- " + notas[0][2] + " -- ");
        }
        if (nota01 >=7 ){
            System.out.println("MATÉRIA: " + disciplinas[1] + ". NOTA FINAL: "+ String.format("%.2f", nota02) +". situação: APROVADO"  );
            System.out.println("Notas: -- "+ notas[1][0] +" -- " + notas[1][1] + " -- " + notas[1][2] + " -- ");
        }else {
            System.out.println("MATÉRIA: " + disciplinas[1] + ". NOTA FINAL: "+ String.format("%.2f", nota02) + ". situação: REPROVADO"  );
            System.out.println("Notas: -- "+ notas[1][0] +" -- " + notas[1][1] + " -- " + notas[1][2] + " -- ");
        }
        if (nota01 >=7 ){
            System.out.println("MATÉRIA: " + disciplinas[2] + ". NOTA FINAL: "+ String.format("%.2f", nota03) + ". situação: APROVADO"  );
            System.out.println("Notas: -- "+ notas[2][0] +" -- " + notas[2][1] + " -- " + notas[2][2] + " -- ");
        }else {
            System.out.println("MATÉRIA: " + disciplinas[2] + ". NOTA FINAL: "+ String.format("%.2f", nota03) + ". situação: REPROVADO"  );
            System.out.println("Notas: -- "+ notas[2][0] +" -- " + notas[2][1] + " -- " + notas[2][2] + " -- ");
        }
    Double MediaGeral = (nota01 + nota02 + nota03)/3;
    System.out.println("Sua média geral foi de: ");
    return MediaGeral;
    }

    boolean Verificardor(String curso, int matricula){
        boolean acesso = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("********VERIFICADOR DE DADOS***************");
        System.out.println("DIGITE SUA MATRICULA: ");
        int numero = scan.nextInt();
        System.out.println("DIGITE O SEU CURSO: ");
        String cursando = scan.next();

        if ((numero == matricula) && (curso.equals(cursando))){
            System.out.println("ACESSO AUTORIZADO: " + nome);
            acesso = true;
        } else {
            System.out.println("ACESSO NEGADO");

        }
        return acesso;
    }



}
