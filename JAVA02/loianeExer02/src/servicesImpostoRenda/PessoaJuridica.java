package servicesImpostoRenda;

import entidadeImpostoRenda.Contribuinte;

public class PessoaJuridica extends Contribuinte {

    private int imposto;

    public int getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    public void ValorPagar(){
        double valorPagar = ((double) 10/100)*getRenda();
        String StrValorPagar = String.format("%.2f",valorPagar);
        System.out.println("O Valor a ser pago pela Empresa: [ "+getNome()+" ].[ Rendimento: R$"+getRenda()+" ] é de R$"+StrValorPagar);
    }
    public void ValorPagar(int imposto){
        double valorPagar = ((double) imposto/100)*getRenda();
        String StrValorPagar = String.format("%.2f",valorPagar);
        System.out.println("O Valor a ser pago pela Empresa: [ "+getNome()+" ].[ Rendimento: R$"+getRenda()+" ] é de R$"+StrValorPagar);
    }
}
