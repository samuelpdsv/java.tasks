package Exercicios;

public class Calculadora {

    public static double somar(double num1, double num2){
        double soma = num1 + num2;
        return soma;
    }
    public static double subtrair(double num1, double num2){
        double subtracao = num1 - num2;
        return subtracao;
    }
    public static double multiplicar(double num1, double num2){
        double multiplicacao = num1 * num2;
        return multiplicacao;
    }
    public static double potenciar(double num1,double num2){
        double potencia = Math.pow(num1, num2);
        return potencia;
    }
    public static int fatoriar(int num1) {
        int fator = 1;
        while (num1 >= 1){
            fator *= num1;
            num1--;

        }
        System.out.println("o final" + fator);
        return fator;
    }

}
