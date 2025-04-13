package Exercicios;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();

        System.out.println("--------DIGITE O NOME DA AGENDA---------------");
        String nome = scan.next();
        agenda.setNome(nome);

        System.out.println("*******CONTATOS************");


        Contato contato01 = new Contato();

        System.out.println("Digite o nome do primeiro contato: ");
        String nomeContato01 = scan.next();
        contato01.setNome(nomeContato01);
        System.out.println("Digite o Telefone do primeiro contato: ");
        String telefoneContato01 = scan.next();
        contato01.setTelefone(telefoneContato01);
        System.out.println("Digite o Email do primeiro contato: ");
        String emailContato = scan.next();
        contato01.setEmail(emailContato);

        Contato contato02 = new Contato();

        System.out.println("Digite o nome do segundo contato: ");
        String nomeContato02 = scan.next();
        contato02.setNome(nomeContato02);
        System.out.println("Digite o Telefone do segundo contato: ");
        String telefoneContato02 = scan.next();
        contato02.setTelefone(telefoneContato02);
        System.out.println("Digite o Email do segundo contato: ");
        String emailContato02 = scan.next();
        contato02.setEmail(emailContato02);

        Contato contato03 = new Contato();

        System.out.println("Digite o nome do terceiro contato: ");
        String nomeContato03 = scan.next();
        contato03.setNome(nomeContato03);
        System.out.println("Digite o Telefone do terceiro contato: ");
        String telefoneContato03 = scan.next();
        contato03.setTelefone(telefoneContato03);
        System.out.println("Digite o Email do terceiro contato: ");
        String emailContato03 = scan.next();
        contato03.setEmail(emailContato03);

        Contato[] contatos = new Contato[3];
        contatos[0] = contato01;
        contatos[1] = contato02;
        contatos[2] = contato03;

        agenda.setContato(contatos);

        //MOSTRA OS CONTATOS INDIVIDUALMENTE.
        //contato01.MostrarContato();
        //contato02.MostrarContato();
        //contato03.MostrarContato();
        agenda.getContato();
        agenda.MostrarTodos(contatos);

        //Forma de acessar a lista.
        /**System.out.println("NOME DA AGENDA [ " + agenda.getNome() + "]");
        if (agenda != null && agenda.getContato() != null){
            for (Contato t : agenda.getContato()){
                System.out.println("[ "+t.getNome()+" - "+t.getTelefone() +" - "+ t.getEmail()+" ]");
            }
        }**/





    }
}
