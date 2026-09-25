package ThreadsSynchronized;

public class MinhaThread implements Runnable{

    private String nome;
    private int[] arrey;
    private static Calculadora calculadora = new Calculadora();

    public MinhaThread(String nome, int[] arrey) {
        this.nome = nome;
        this.arrey = arrey;
        new  Thread(this).start();

    }

    @Override
    public void run() {

        System.out.println("Minha thread " + this.nome + " executando...");

        int soma = calculadora.somaArrey(this.arrey);

        System.out.println("Soma: " + soma + " thread: " + this.nome);

        System.out.println(this.nome + " thread F I N A L I Z A D A ");
    }


}
