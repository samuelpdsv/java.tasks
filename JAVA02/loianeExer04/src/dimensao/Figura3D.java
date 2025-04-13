package dimensao;

import entidade.FiguraGeometrica;

public abstract class Figura3D extends FiguraGeometrica {

    private double volume;

    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
