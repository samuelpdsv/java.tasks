package sevicesAnimal;

import entidadeAnimal.Animal;

public class Mamifero extends Animal {

    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    public void Zoo(){

        System.out.println("Animal: "+getNome());
        System.out.println("Comprimento: "+getComprimetos()+" cm");
        System.out.println("Patas: "+getNumeroDePatas());
        System.out.println("Cor: "+ getCor());
        System.out.println("Ambiente: "+getAmbinte());
        System.out.println("Velocidade: "+getVelocidade()+" m/s");
        System.out.println("Alimento: "+alimento);
        System.out.println("--------------------------------------");
    }
}
