import java.util.Scanner;
public class Leitor {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idadeUser = scan.nextInt();

        System.out.println("A SUA IDADE É " + idadeUser);

        System.out.println("Qual é a idade do seu pai? ");
        int idadePai = scan.nextInt();

        System.out.println("Qual é a idade da sua Mãe? ");
        int idadeMae = scan.nextInt();

        int soma = idadePai + idadeMae + idadeUser;

        if (idadePai > idadeMae) {
            int diferenPaiMae = idadePai - idadeMae;
            System.out.println("A diferença entre os seu pais é de: " + diferenPaiMae);
        }
        else {
            int diferenPaiMae = idadeMae - idadePai;
            System.out.println("A diferença entre os seu pais é de: " + diferenPaiMae);
        }

        int diferenUserPai = idadePai - idadeUser;
        int diferenUserMae = idadeMae - idadeUser;

        int diferenPaiMae;
        System.out.println("A diferença entre vc e seu pai é de: " + diferenUserPai);
        System.out.println("A diferença entre vc e sua Mãe é de: " + diferenUserMae);

        if (idadePai - idadeMae >= 10){
            System.out.println("Oq seu pai andava fazendo comendo meninas muito mais novas do que ele? ");
        }
        if (idadeMae - idadePai >= 10){
            System.out.println("Eita que sua mãe gostava dos novinhos né kkskKKSKSSKSKSKSK");
        }

        switch(idadePai) {

            case 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 : System.out.println("Pai jovem delicia"); break;
            case 26, 27, 28, 29, 30, 31, 32, 33, 34, 35 : System.out.println("Pai jovem adulto que delicia"); break;
            case 36, 37, 38, 39, 40, 41, 42, 43, 44, 45 : System.out.println("Pai adulto que delicia"); break;
            case 46, 47, 48, 49, 50, 51, 52, 53, 54, 55 : System.out.println("Pai maduro que yummy"); break;
            default: System.out.println("velho ele em");
        }


    }
}
