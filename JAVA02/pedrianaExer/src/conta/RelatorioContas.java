package conta;

import entidades.Conta;

public class RelatorioContas extends Conta{

    @Override
    public void exibirDetalhes() {
    }

    public void exibirListagem(Conta[] conta){
        for (Conta contas : conta){
            System.out.println("--------------------------------RELATÓRIO------------------------------------");
            System.out.println("Descrição: ["+contas.getDescricao()+"] Data de Vencimento: ["+contas.getDataVencimento()+"]");
            System.out.println("O Valor é de: R$"+contas.getValor());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
