package ThreadsIsAliveJoin;

public class MinhaThread {

    public class minhaThread implements Runnable {

        private String nome;
        private int tempo;


        public minhaThread(String nome, int tempo) {
            this.nome = nome;
            this.tempo = tempo;
            Thread t = new Thread(this);
        }

        public minhaThread(String nome) {
            this.nome = nome;
        }

        @Override
        public void run() {
            System.out.println("Execuatndo thread:  " + this.nome);


            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(this.nome + " Nº : [" + i + "]");
                    Thread.sleep(tempo);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("F I N A L I Z A D A :  " + this.nome);
        }

    }
}
