package Exercicios;

public class ConversorDeUndArea {

    public static double MetroQuadradoParaPeQuadrado(double num1){
        Double PeQuadrado = num1 * 10.76;
        return PeQuadrado;
    }
    public static double PeQuadradoParaCentimetro(double num1){
        double centrimetro = num1 * 929;
        return centrimetro;
    }
    public static double MilhaParaAcres(double num1){
        double acres = num1 * 640;
        return acres;
    }
    public static double AcreParaPeQuadrado(double num1){
        double peQuadrado = num1 * 43560;
        return peQuadrado;
    }

}
