package dimensao;

import entidade.FiguraGeometrica;

public abstract class Figura2D extends FiguraGeometrica {

    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
