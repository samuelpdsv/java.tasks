package entidades;

import java.util.Scanner;

public class ContaBancaria {
    private String nome;
    private int numConta;
    private double saldo;

    public Scanner scan = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double Sacar(){
        System.out.println("*********************************************");
        System.out.println("OLÁ "+ nome+ " conta: ["+numConta+"]");
        System.out.println("DIGITE O VALOR QUE DESEJA SACAR: ");
        System.out.println("Seu saldo disponivel é: [ R$" +saldo+ "]");
        double saque = scan.nextDouble();
        double valorSaque = saldo - saque;
        setSaldo(valorSaque);
        return saldo;
    }
    public double Depositar(){
        System.out.println("*********************************************");
        System.out.println("OLÁ "+ nome+ " conta: ["+numConta+"]");
        System.out.println("DIGITE O VALOR QUE DESEJA DEPOSITAR: ");
        System.out.println("Sua conta possui: [ R$" +saldo+ "]");
        double deposito = scan.nextDouble();
        double valorDeposito = saldo + deposito;
        setSaldo(valorDeposito);
        return saldo + deposito;
    }

    public void MostrarConta(){
        System.out.println("-------------------DADOS DA CONTA--------------------");
        System.out.println(" Proprietário: [ "+nome+" ]. Numero: [ "+numConta+" ]");
        System.out.println("Saldo disponivel: R$"+saldo);
        System.out.println("-----------------------------------------------------");
    }
}
