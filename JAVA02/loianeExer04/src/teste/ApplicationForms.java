package teste;

import entidade.FiguraGeometrica;
import formas.*;

public class ApplicationForms {
    public static void main(String[] args) {

        Cicurlo circulo00 = new Cicurlo();
        circulo00.setNome("Circulo primeiro");
        circulo00.setCor("Vermelho");
        circulo00.setRaio(4);
        circulo00.setDiametro(8);
        Cicurlo circulo01 = new Cicurlo("Circulo segundo","Azul",3,6);

        Quadrado quadrado00 = new Quadrado();
        quadrado00.setNome("Quadrado primeiro");
        quadrado00.setCor("Branco");
        quadrado00.setLado(4);
        Quadrado quadrado01 = new Quadrado("Quadrado segundo","Amarelo",8);

        Triangulo triangulo00 = new Triangulo();
        triangulo00.setNome("Peridote");
        triangulo00.setCor("Verde");
        triangulo00.setBase(2.5);
        triangulo00.setAltura(3);
        Triangulo triangulo01 = new Triangulo("Triangulo", "Roxo", 5, 6);

        Cilindro cilindro00 = new Cilindro();
        cilindro00.setNome("Cilindro primeiro");
        cilindro00.setCor("Cinza");
        cilindro00.setRaio(6);
        cilindro00.setAltura(12);
        Cilindro cilindro01 = new Cilindro("Cilindro segund","Laranja", 3, 7);

        Cubo cubo00 = new Cubo("Cubo primeiro","Rosa",5);
        Cubo cubo01 = new Cubo("Cubo segundo","Preto",9);

        Piramide piramide00 = new Piramide("Piramide primeira","Marrom", 6, 7, 4);
        Piramide piramide01 = new Piramide("Piramide segunda","Marfim", 4, 5, 3);

        circulo00.CalcularArea();
        circulo01.CalcularArea();
        quadrado00.CalcularArea();
        quadrado01.CalcularArea();
        triangulo00.CalcularArea();
        triangulo01.CalcularArea();
        cilindro00.CalcularArea();
        cilindro00.CalcularVolume();
        cilindro01.CalcularArea();
        cilindro01.CalcularVolume();
        cubo00.CalcularArea();
        cubo00.CalcularVolume();
        cubo01.CalcularArea();
        cubo01.CalcularVolume();
        piramide00.CalcularArea();
        piramide00.CalcularVolume();
        piramide01.CalcularArea();
        piramide01.CalcularVolume();


        FiguraGeometrica[] figurasGeometicas = new FiguraGeometrica[12];
        figurasGeometicas[0] = circulo00;
        figurasGeometicas[1] = circulo01;
        figurasGeometicas[2] = quadrado00;
        figurasGeometicas[3] = quadrado01;
        figurasGeometicas[4] = triangulo00;
        figurasGeometicas[5] = triangulo01;
        figurasGeometicas[6] = cilindro00;
        figurasGeometicas[7] = cilindro01;
        figurasGeometicas[8] = cubo00;
        figurasGeometicas[9] = cubo01;
        figurasGeometicas[10] = piramide00;
        figurasGeometicas[11] = piramide01;

        for (FiguraGeometrica figura : figurasGeometicas){
            if (figura instanceof Cicurlo){
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Figura: [" + figura.getNome() + "]. Cor: [ "+ figura.getCor()+" ]" );
                System.out.println("Tamanho da Area: [ "+((Cicurlo) figura).getArea()+" ]");
            } else if ( figura instanceof Quadrado ) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Figura: [" + figura.getNome() + "]. Cor: [ "+ figura.getCor()+" ]" );
                System.out.println("Tamanho da Area: [ "+((Quadrado) figura).getArea()+" ]");
            } else if ( figura instanceof Triangulo) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Figura: [" + figura.getNome() + "]. Cor: [ "+ figura.getCor()+" ]" );
                System.out.println("Tamanho da Area: [ "+((Triangulo) figura).getArea()+" ]");
            } else if (figura instanceof Cilindro) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Figura: [" + figura.getNome() + "]. Cor: [ "+ figura.getCor()+" ]" );
                System.out.println("Tamanho da Area: [ "+((Cilindro) figura).getArea()+" ]. Volume: [ "+ ((Cilindro) figura).getVolume()+"]");
            } else if ( figura instanceof Cubo) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Figura: [" + figura.getNome() + "]. Cor: [ "+ figura.getCor()+" ]" );
                System.out.println("Tamanho da Area: [ "+((Cubo) figura).getArea()+" ]. Volume: [ "+ ((Cubo) figura).getVolume()+"]");
            } else if ( figura instanceof  Piramide) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Figura: [" + figura.getNome() + "]. Cor: [ "+ figura.getCor()+" ]" );
                System.out.println("Tamanho da Area: [ "+((Piramide) figura).getArea()+" ]. Volume: [ "+ ((Piramide) figura).getVolume()+"]");
            }

        }




    }
}
