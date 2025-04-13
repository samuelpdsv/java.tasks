package formas;

import dimensao.Figura2D;
import interfaces.DimensaoSuperficial;

public class Triangulo extends Figura2D implements DimensaoSuperficial {

    private double base;
    private double altura;

    public Triangulo(){}

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

    public Triangulo(String nome,String cor, double base, double altura){
        this.base = base;
        this.altura = altura;
        super.setNome(nome);
        super.setCor(cor);
    }

    @Override
    public void CalcularArea() {
        double total = ((base*altura)/2);
        setArea(total);

    }
}
