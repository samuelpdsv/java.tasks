package Threads;

public class MinhaThread extends Thread {

    private String nome;
    private int tempo;


    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    public MinhaThread(String nome) {
        this.nome = nome;
        start();
    }

    public MinhaThread(String nome, int[] arrey) {
    }

    public void run() {
        System.out.println("Execuatndo thread:  " + this.nome);


            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(this.nome + " Nº : ["+ i +"]");
                    Thread.sleep(tempo);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        System.out.println("F I N A L I Z A D A :  " + this.nome);


    }
}
