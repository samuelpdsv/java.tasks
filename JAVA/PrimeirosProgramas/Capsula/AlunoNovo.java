package Capsula;

public class AlunoNovo {
    private String nome;
    private int matricula;
    private String curso;
    private String[] disciplinas = new String[3];
    private double[][] notas = new double[3][3];

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }
}
