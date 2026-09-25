package ThreadsIsAliveJoin;

import Threads.MinhaThread;

public class Teste {

    static void main(String[] args) throws InterruptedException {

        Threads.MinhaThread thread1 = new Threads.MinhaThread("THREAD 001#", 100);

        Threads.MinhaThread thread2 = new Threads.MinhaThread("THREAD 002#", 200);

        Threads.MinhaThread thread3 = new Threads.MinhaThread("THREAD 003#", 400);

        Threads.MinhaThread thread4 = new MinhaThread("THREAD 004#", 800);


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        //while (thread1.isAlive() || thread2.isAlive() || thread3.isAlive() || thread4.isAlive() ) { exemple . . . }
        //OPÇÃO MENOS ELEGANTE. EL

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("PROGRAMA FINALIZADO");
    }
}
