package applicationImpostoRenda;

import servicesImpostoRenda.PessoaFisica;
import servicesImpostoRenda.PessoaJuridica;

public class ApplicationIR {
    public static void main(String[] args) {

        PessoaJuridica pj01 = new PessoaJuridica();
        pj01.setNome("Editora Taiga");
        pj01.setRenda(3400250.50);

        PessoaJuridica pj02 = new PessoaJuridica();
        pj02.setNome("Hotel Vila Real");
        pj02.setRenda(67800400.0);

        PessoaJuridica pj03 = new PessoaJuridica();
        pj03.setNome("Cartomante Álvaro");
        pj03.setRenda(6500.0);

        //PESSOAS FISICAS

        PessoaFisica pf01 = new PessoaFisica();
        pf01.setNome("Yohannes Hein Reich Heins");
        pf01.setRenda(2200.0);

        PessoaFisica pf02 = new PessoaFisica();
        pf02.setNome("Kuragato Nakasa");
        pf02.setRenda(15000.0);

        PessoaFisica pf03 = new PessoaFisica();
        pf03.setNome("Lorysklaydyson da Silva");
        pf03.setRenda(1100.0);

        pj01.ValorPagar();
        pj02.ValorPagar();
        pj03.ValorPagar();

        pf01.ValorPagar();
        pf02.ValorPagar();
        pf03.ValorPagar();

    }
}
