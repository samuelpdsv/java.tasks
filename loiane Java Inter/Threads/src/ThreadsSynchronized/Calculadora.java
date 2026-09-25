package ThreadsSynchronized;

public class Calculadora {

    private int soma;

    public synchronized int somaArrey(int[] arrey) {

        int soma = 0;


        for (int i = 0; i < arrey.length; i++){
            soma = soma + arrey[i];
            System.out.println("EXECUTANDO SOMA: " + Thread.currentThread().getName() + " no valor de: "+ arrey[i] +" : " + soma);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        return soma;
    }
}


