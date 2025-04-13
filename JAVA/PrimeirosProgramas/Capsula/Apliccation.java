package Capsula;

public class Apliccation {
    public static void main(String[] args){

        NovaContaCorrente NovaConta = new NovaContaCorrente();

        NovaConta.setNumero(111);
        NovaConta.setSaldo(4500.90);
        NovaConta.setStatus(true);
        NovaConta.setLimite(1250);
        System.out.println(NovaConta.getNumero());;
        System.out.println(NovaConta.getSaldo());
        System.out.println(NovaConta.getStatus());
        System.out.println(NovaConta.getLimite());
        NovaConta.fazerSaque(NovaConta.saque());

    }
}
