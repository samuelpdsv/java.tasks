package servicesImpostoRenda;

import entidadeImpostoRenda.Contribuinte;

public class PessoaFisica extends Contribuinte {

    public void ValorPagar(){
        if (getRenda() > 0 && getRenda() <= 1400){
            System.out.println("Conta: ["+getNome()+"].[Renda R$"+getRenda()+" ] é isenta de imposto.");
        } else if (getRenda() > 1400 && getRenda() <= 2100) {
            double imposto = ((double) 10 /100)*getRenda();
            System.out.println("Conta: ["+getNome()+"].[Renda: R$"+getRenda()+" ]. Pagará: R$"+imposto);
        }else if (getRenda() > 2100 && getRenda() <= 2800) {
            double imposto = ((double) 15 /100)*getRenda();
            System.out.println("Conta: ["+getNome()+"].[Renda: R$"+getRenda()+" ]. Pagará: R$"+imposto);
        }else if (getRenda() > 2800 && getRenda() <= 3600) {
            double imposto = ((double) 25 /100)*getRenda();
            System.out.println("Conta: ["+getNome()+"].[Renda: R$"+getRenda()+" ]. Pagará: R$"+imposto);
        }else if (getRenda() > 3600) {
            double imposto = ((double) 30 /100)*getRenda();
            System.out.println("Conta: ["+getNome()+"].[Renda: R$"+getRenda()+" ]. Pagará: R$"+imposto);
        }
    }
}
