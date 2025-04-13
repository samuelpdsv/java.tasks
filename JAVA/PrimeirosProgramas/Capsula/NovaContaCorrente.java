package Capsula;

import java.util.Scanner;

public class NovaContaCorrente {
    Scanner scan = new Scanner(System.in);
    private int numero;
    private double saldo;
    private boolean status;
    private double limite;

    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public double saque(){
        Scanner scan = new Scanner(System.in);
        System.out.println("DIGITE O VALOR QUE DESEJA RETIRAR: ");
        double saque = scan.nextDouble();
        return saque;
    }


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
