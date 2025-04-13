package services;

import entidades.ContaBancaria;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double Sacar(){
        System.out.println("OLÁ "+ getNome() + " conta: ["+ getNumConta() +"]");
        System.out.println("DIGITE O VALOR QUE DESEJA SACAR: ");
        System.out.println("Seu saldo disponivel é: [ R$" +getSaldo()+ " ]");
        double saque = scan.nextDouble();
        if (saque > limite){
            System.out.println("Saque acima do limite.");
            System.out.println("limite da conta: [ R$"+limite+ " ]");
            return saque;
        }
        double valorSaque = getSaldo()-saque;
        setSaldo(valorSaque);
        return getSaldo();
    }

    public void Mostrar(){
        System.out.println("-------------------DADOS DA CONTA---------------------------");
        System.out.println(" Proprietário: [ "+getNome()+" ]. Numero: [ "+getNumConta()+" ]");
        System.out.println("Saldo disponivel: R$"+getSaldo());
        System.out.println("Limite: R$"+limite);
        System.out.println("-------------------------------------------------------");

    }
}
