package TestesComEnums;

public enum TipoDocumento {

    CPF {
        @Override
        public String GerarNumeroTeste() {
            return GeraCPFeCNPJ.DocGen.generateCpf();
        }
    },
    CNPJ {
        @Override
        public String GerarNumeroTeste() {
            return GeraCPFeCNPJ.DocGen.generateCnpj(true);
            //return GeraCPFeCNPJ.DocGen.generateCnpj(true).toString();
        }
    };

    public abstract String GerarNumeroTeste();

}

