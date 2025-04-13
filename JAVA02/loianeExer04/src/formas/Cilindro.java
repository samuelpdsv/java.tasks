package formas;

import dimensao.Figura3D;
import interfaces.DimensaoSuperficial;
import interfaces.DimensaoVolumentrica;

public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumentrica {

    private double raio;
    private double altura;

    public Cilindro(){}

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Cilindro(String nome, String cor, double raio, double altura){
        this.raio = raio;
        this.altura = altura;
        super.setNome(nome);
        super.setCor(cor);
    }

    @Override
    public void CalcularArea() {
        double total = (2 * 3.14 * raio *( raio * altura));
        setArea(total);
    }

    @Override
    public void CalcularVolume() {
        double total = (3.14 * (raio * raio) * altura);
        setVolume(total);
    }
}
