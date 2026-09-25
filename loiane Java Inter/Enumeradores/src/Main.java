
void main() {



    System.out.println("hello again");
    ImprimirDiaSemana(3);

    DiasSemanaConstrutor dia = DiasSemanaConstrutor.SEGUNDA;

    System.out.println(dia.getValor());

}

private static void ImprimirDiaSemana(int dia){
    switch (dia){
        case 1:
            System.out.println("Segunda");
            break;
        case 2:
            System.out.println("Terça");
            break;
        case 3:
            System.out.println("Quarta");
            break;
        case 4:
            System.out.println("Quinta");
            break;
        case 5:
            System.out.println("Sexta");
            break;
        case 6:
            System.out.println("Sabado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
    }
}


private static void DiaSemana(){

    int seg = DiasSemana.SEGUNDA.ordinal();
    int ter = DiasSemana.TERCA.ordinal();
    int qua = DiasSemana.QUARTA.ordinal();
    int qui = DiasSemana.QUINTA.ordinal();
    int sex = DiasSemana.SEXTA.ordinal();
    int sab = DiasSemana.SEXTA.ordinal();
    int dom = DiasSemana.DOMINGO.ordinal();


}

