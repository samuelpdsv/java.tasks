package TestesComEnums;

public class TesteDocumento{
    public static void main(String[] args) {

        for (TipoDocumento doc : TipoDocumento.values()) {
            System.out.println(doc.GerarNumeroTeste());
        }

        Pessoa pf = new Pessoa();
        pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumeroDocumento(pf.getTipoDocumento().GerarNumeroTeste());
        System.out.println(pf.getTipoDocumento());
        System.out.println(pf.getNumeroDocumento());

        Pessoa pj = new Pessoa();
        pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pj.setNumeroDocumento(pj.getTipoDocumento().GerarNumeroTeste());
        System.out.println(pj.getTipoDocumento());
        System.out.println(pj.getNumeroDocumento());




    }
}
