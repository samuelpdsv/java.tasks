package Exercicios;

public class ConversaoDeUnidadeTempo {

    public static double MinutoParaSegundo(double num1){
        Double Segundo = num1 * 60;
        return Segundo;
    }
    public static double HoraParaMinutoo(double num1){
        double hora = num1 * 60;
        return hora;
    }
    public static double DiaParaHora(double num1){
        double hora = num1 * 24;
        return hora;
    }
    public static double SemanaParaDia(double num1){
        double dia = num1 * 7;
        return dia;
    }
    public static double MesParaDia(double num1){
        double dia = num1 * 30;
        return dia;
    }
    public static double AnoParaDias(double num1){
        double ano = num1 * 365.25;
        return ano;
    }

}
