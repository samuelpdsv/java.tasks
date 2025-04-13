package sevicesAnimal;

import entidadeAnimal.Animal;

public class Peixe extends Animal {

    private String caracteristica;

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void Zoo(){

        System.out.println("Animal: "+getNome());
        System.out.println("Comprimento: "+getComprimetos()+" cm");
        System.out.println("Patas: "+getNumeroDePatas());
        System.out.println("Cor: "+ getCor());
        System.out.println("Ambiente: "+getAmbinte());
        System.out.println("Velocidade: "+getVelocidade()+" m/s");
        System.out.println("Caracteristica: "+caracteristica);
        System.out.println("--------------------------------------");
    }
}
