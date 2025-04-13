public class AlunosMatriculados {

    public static void main(String[] args){

        Aluno aluno01 = new Aluno();

        aluno01.nome = "Hermmann Magalhães Lima";
        aluno01.matricula = 666;
        aluno01.curso = "Bruxaria";
        aluno01.disciplinas = new String[3];
            aluno01.disciplinas[0] = "Defesa Contra a Arte das Trevas";
            aluno01.disciplinas[1] = "História da Magia";
            aluno01.disciplinas[2] = "Ciencias Ocultas II";
        aluno01.notas = new double[3][3];
            aluno01.notas[0][0] = 10;
            aluno01.notas[0][1] = 9.8;
            aluno01.notas[0][2] = 9.5;

            aluno01.notas[1][0] = 7.5;
            aluno01.notas[1][1] = 6;
            aluno01.notas[1][2] = 5.9;

            aluno01.notas[2][0] = 7;
            aluno01.notas[2][1] = 8;
            aluno01.notas[2][2] = 7.5;

        /**System.out.println(aluno01.disciplinas[1]);
        System.out.println((aluno01.notas[1][2]));
        aluno01.CalcularNotas(aluno01.notas);**/
        /**System.out.println((aluno01.CalcularNotasMateria(aluno01.notas, aluno01.disciplinas)));**/
        /**aluno01.Verificardor(aluno01.curso, aluno01.matricula);**/
        if ((aluno01.Verificardor(aluno01.curso, aluno01.matricula)) == true){
            System.out.println((aluno01.CalcularNotasMateria(aluno01.notas, aluno01.disciplinas)));
        }


    }

}
