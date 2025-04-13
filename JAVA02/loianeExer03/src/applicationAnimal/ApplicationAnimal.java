package applicationAnimal;

import entidadeAnimal.Animal;
import sevicesAnimal.Mamifero;
import sevicesAnimal.Peixe;

public class ApplicationAnimal {
    public static void main(String[] args) {

        Animal camelo = new Animal();
        camelo.setNome("Camelo-Albino");
        camelo.setComprimetos(150);
        camelo.setNumeroDePatas(4);
        camelo.setCor("Amarelo: ");
        camelo.setAmbinte("Terra:");
        camelo.setVelocidade(2.0);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimetos(300);
        tubarao.setNumeroDePatas(0);
        tubarao.setCor("Cinzento");
        tubarao.setAmbinte("Mar");
        tubarao.setVelocidade(1.5);
        tubarao.setCaracteristica("Barbatanas e calda.");

        Mamifero urso = new Mamifero();
        urso.setNome("Urso-Canadense");
        urso.setComprimetos(180);
        urso.setNumeroDePatas(4);
        urso.setCor("Vermelho");
        urso.setAmbinte("Terra");
        urso.setVelocidade(0.5);
        urso.setAlimento("Mel");

        System.out.println("---------------ZOO-----------------");
        camelo.Zoo();
        tubarao.Zoo();
        urso.Zoo();



    }
}
