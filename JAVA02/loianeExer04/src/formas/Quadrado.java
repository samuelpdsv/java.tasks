package formas;

import dimensao.Figura2D;
import interfaces.DimensaoSuperficial;

public class Quadrado extends Figura2D implements DimensaoSuperficial {

    private double lado;

    public Quadrado(){}

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado(String nome,String cor,double lado){
        this.lado = lado;
        super.setNome(nome);
        super.setCor(cor);
    }

    @Override
    public void CalcularArea() {
        double total = lado*lado;
        setArea(total);
    }

}
