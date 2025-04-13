package services;

import entidades.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void CalcularNovoSaldo(){
        double valorPercento = ((double) getDiaRendimento() / 100)*getSaldo();
        double value = getSaldo() + valorPercento;
        setSaldo(value);
    }
    public void Mostrar(){
        System.out.println("-------------------DADOS DA CONTA---------------------------");
        System.out.println(" Proprietário: [ "+getNome()+" ]. Numero: [ "+getNumConta()+" ]");
        System.out.println(" Saldo disponivel ( com o rendimento ): R$"+getSaldo());
        System.out.println("------------------------------------------------------------");

    }

}
