package Exercicios;

public class ConverUndVolume {
    public static double LitroParaCentrimetroCub(double num1){
        Double centimetroCubico = num1 * 1000;
        return centimetroCubico;
    }
    public static double MetroCubParaLitro(double num1){
        double litro = num1 * 1000;
        return litro;
    }
    public static double MetroCubParaPeCub(double num1){
        double pesCubicos = num1 * 35.32;
        return pesCubicos;
    }
    public static double GalaoAmericanParaPolegadaCub(double num1){
        double polegadaCub = num1 * 231;
        return polegadaCub;
    }
    public static double GalaoAmericanParaLitro(double num1){
        double litro = num1 * 3785;
        return litro;
    }

}
