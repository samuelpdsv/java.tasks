import java.util.Scanner;

public class Lampadas {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Lampada led = new Lampada();
        led.marca = "Solaris";
        led.codigo = 00666;
        led.modelo = "Oceanica";

        Lampada lua = new Lampada();
        lua.marca = "Lunatica";
        lua.codigo = 22222;
        lua.modelo = "Bolota Branca 5ºed.";

        System.out.println("As lampadas são dos modelos: "+ led.modelo + " e " + lua.modelo);
        System.out.println("Deseja ligar a lampada, ou desligar? ");
        int acenderApagar = scan.nextInt();
        led.ligaDesliga(acenderApagar);


    }
}
