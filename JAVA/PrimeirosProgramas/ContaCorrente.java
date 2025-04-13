import java.util.Scanner;

public class ContaCorrente {

    Scanner scan = new Scanner(System.in);
    int numero;
    double saldo;
    boolean status;
    double limite;


    double fazerSaque(double saque){
        if (((saldo > saque) && (status == true)) && (saque <= limite)){
            System.out.println("Saque aprovado.");
        }else {
            System.out.println("Saque negado.");
        }
        return saque;
    }
    double depositar(double deposito){
        double NovoSaldo = deposito + saldo;
        System.out.println("Seu novo saldo após o deposito é de: R$" + NovoSaldo);
        return NovoSaldo;
    }
    void consultarSaldo() {
        System.out.println("Seu saldo é de: R$" + saldo);
    }
    boolean checarCheque(boolean status){
        if (status == true){
            System.out.println("A conta. É especial. Possui cheque.");
        }else{
            System.out.println("A conta. Não é especial. Não possui cheque.");
        }
    return status;
    }

}
