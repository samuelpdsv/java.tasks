package entidadeAnimal;

public class Animal {

    private String nome;
    private double comprimetos;
    private int numeroDePatas;
    private String cor;
    private String ambinte;
    private double velocidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimetos() {
        return comprimetos;
    }

    public void setComprimetos(double comprimetos) {
        this.comprimetos = comprimetos;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbinte() {
        return ambinte;
    }

    public void setAmbinte(String ambinte) {
        this.ambinte = ambinte;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void Zoo(){

        System.out.println("Animal: "+nome);
        System.out.println("Comprimento: "+comprimetos+" cm");
        System.out.println("Patas:"+numeroDePatas);
        System.out.println("Cor: "+cor);
        System.out.println("Ambiente: "+ambinte);
        System.out.println("Velocidade"+velocidade+" m/s");
        System.out.println("-----------------------------------");
    }

}
