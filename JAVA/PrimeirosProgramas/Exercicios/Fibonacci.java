package Exercicios;
//VER DEPOIS RESOLUÇÃO
public class Fibonacci {

    public static int ValorFibonacci(int CasaFibonacci){
        int casa = 1;
        if (CasaFibonacci == 0){
            return 1;
        }
        return CasaFibonacci + (CasaFibonacci);

    }
}
