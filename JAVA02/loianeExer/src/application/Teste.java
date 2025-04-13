package application;

import entidades.ContaBancaria;
import services.ContaEspecial;
import services.ContaPoupanca;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ContaPoupanca  contaP01 = new ContaPoupanca();
        contaP01.setNome("Volodimir");
        contaP01.setNumConta(1234);
        contaP01.setSaldo(18500.50);
        contaP01.setDiaRendimento(22);

        ContaEspecial contaE01 = new ContaEspecial();
        contaE01.setNome("Sayat");
        contaE01.setNumConta(555);
        contaE01.setSaldo(7200);
        contaE01.setLimite(1200);

        contaP01.MostrarConta();
        contaE01.MostrarConta();

        contaP01.Sacar();
        contaE01.Sacar();
        contaP01.Depositar();
        contaE01.Depositar();
        contaP01.MostrarConta();
        contaE01.MostrarConta();
        System.out.println("Digite o rendimento do dia: ");
        int rendimento = scan.nextInt();
        contaP01.setDiaRendimento(rendimento);
        contaP01.CalcularNovoSaldo();
        contaP01.Mostrar();
        contaE01.Mostrar();

    }
}
