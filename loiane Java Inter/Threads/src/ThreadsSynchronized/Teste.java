package ThreadsSynchronized;


import Threads.MinhaThread;

public class Teste {
    static void main(String[] args) {

        int[] arrey = {1, 2, 3};

        Thread t1 = new MinhaThread("THREAD 001", arrey);
        Thread t2 = new MinhaThread("THREAD 002", arrey);

        t1.start();
        t2.start();


    }
}
