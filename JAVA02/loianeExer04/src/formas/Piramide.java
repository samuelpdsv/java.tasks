package formas;

import dimensao.Figura3D;
import interfaces.DimensaoSuperficial;
import interfaces.DimensaoVolumentrica;

public class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumentrica {

    private double base;
    private double altura;
    private double lado;

    public Piramide() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Piramide(String nome,String cor,double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
        super.setNome(nome);
        super.setCor(cor);
    }

    @Override
    public void CalcularArea() {
        double quadrado = (lado * lado);
        double triangulo = (((base * altura)/2)*4);
        double total = (quadrado + triangulo);
        setArea(total);

    }

    @Override
    public void CalcularVolume() {
        double total = ((base * altura)/3);
        setVolume(total);

    }
}
