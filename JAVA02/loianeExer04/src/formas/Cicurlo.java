package formas;

import dimensao.Figura2D;
import interfaces.DimensaoSuperficial;

public class Cicurlo extends Figura2D implements DimensaoSuperficial {

    private double raio;
    private double diametro;

    public Cicurlo(){}

    public double getRaio(double raio) {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double CalcularComRaio(double raio){
        double area = (3.14 * (raio * raio));
        setArea(area);
        return area;
    }
    public double CalcularComDiametro(double diametro){
        double area = (3.14 * ((diametro/2)*(diametro/2)));
        setArea(area);
        return area;
    }

    public Cicurlo(String nome,String cor, double raio, double diametro) {
        this.raio = raio;
        this.diametro = diametro;
        super.setNome(nome);
        super.setCor(cor);
    }

    @Override
    public void CalcularArea() {
            CalcularComRaio(raio);
            CalcularComDiametro(diametro);
    }
    /**public void CalcularArea(double diametro) {
        System.out.println("CALCULAR AREA DO CÍRCULO: "+ getNome());
        System.out.println("deseja calcular com o Raio ou com Diâmetro? digite:");
        System.out.println("[[1] - int i = scan.nextInt();Raio] e [[2] - Diamentro]");
        int i = scan.nextInt();

        if (i == 1){
            System.out.println("Digite o valor do raio:");
            double r = scan.nextDouble();
            CalcularComRaio(r);
        } else if (i == 2) {
            System.out.println("Digite o valor do Diametro:");
            double d = scan.nextDouble();
            CalcularComDiametro(d);
        } else {
            System.out.println("O numero digitado não era uma opção.");
        }
    }**/

}
