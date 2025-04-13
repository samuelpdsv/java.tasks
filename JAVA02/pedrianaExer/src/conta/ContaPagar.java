package conta;

import entidades.Conta;
import services.Fornecedor;

public class ContaPagar extends Conta{

    private Fornecedor fornecedor;

    public ContaPagar(){}

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento){
        this.fornecedor = fornecedor;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }


    @Override
    public void exibirDetalhes() {
        System.out.println("--------------------------------RELATÓRIO------------------------------------");
        System.out.println("Descrição: ["+getDescricao()+"] Data de Vencimento: ["+getDataVencimento()+"]");
        System.out.println("O Valor é de: R$"+getValor()+" e o forncedor é: "+fornecedor.getNome());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
