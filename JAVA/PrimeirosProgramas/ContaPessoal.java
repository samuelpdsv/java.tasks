import java.util.Scanner;

public class ContaPessoal {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        ContaCorrente conta01 = new ContaCorrente();
        conta01.numero = 000111;
        conta01.status = true;
        conta01.saldo = 15780.80;
        conta01.limite = 2500.00;

        ContaCorrente conta02 = new ContaCorrente();
        conta02.numero = 000222;
        conta02.status = true;
        conta02.saldo = 3290.10;
        conta02.limite = 1500;

        ContaCorrente conta03 = new ContaCorrente();
        conta03.numero = 000333;
        conta03.status = false;
        conta03.saldo = -200;
        conta03.limite = 500;

        /*System.out.println("Escolha um valor para ser retirado da conta: ");
        double saque = scan.nextDouble();
        conta01.fazerSaque(saque);*/

        /*System.out.println("Escolha um valor para ser depositado da conta: ");
        double deposito = scan.nextDouble();
        conta01.depositar(deposito);*/

        /*System.out.println("O valor na sua conta atualmente é de: ");
        conta01.consultarSaldo();*/

        System.out.println("Verificando se sua conta tem cheque especial.");
        conta03.checarCheque(conta03.status);


    }
}
