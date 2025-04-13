package conta;

import entidades.Conta;
import services.Cliente;
import services.Fornecedor;

public class ContaReceber extends Conta {

    private Cliente cliente;

    public ContaReceber(){}
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento){
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("--------------------------------RELATÓRIO------------------------------------");
        System.out.println("Descrição: ["+getDescricao()+"]. Data de Vencimento: ["+getDataVencimento()+"]");
        System.out.println("O Valor é de: R$"+getValor()+" E o clinte é: ( "+cliente.getNome()+" )");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
