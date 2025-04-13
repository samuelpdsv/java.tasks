import java.util.Scanner;
public class Lampada {

    Scanner scan = new Scanner(System.in);
    String marca;
    String modelo;
    int codigo;

    boolean ligaDesliga (int metodo){
        boolean liga = true;
        boolean desliga = false;
        if (metodo == 1){
            System.out.println("Lampada ligada");
            return liga;
        }else{
            System.out.println("Lampada Desligada");
            return desliga;
        }
    }
}
