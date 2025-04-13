package formas;

import dimensao.Figura3D;
import interfaces.DimensaoSuperficial;
import interfaces.DimensaoVolumentrica;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumentrica {

    private double aresta;

    public Cubo(){}

    public double getLado() {
        return aresta;
    }

    public void setLado(double aresta) {
        this.aresta = aresta;
    }

    public Cubo(String nome,String cor,double aresta){
        this.aresta = aresta;
        super.setNome(nome);
        super.setCor(cor);
    }

    @Override
    public void CalcularArea() {
        double total = (6 * (aresta * aresta));
        setArea(total);

    }
    @Override
    public void CalcularVolume() {
        double total = (aresta * aresta * aresta);
        setVolume(total);
    }
}
