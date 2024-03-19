import java.util.Scanner;

public class Turma {
    private String nome;
    private int ano;
    private int semestre;
    private Professor professor;
    private Aluno[] alunos;
    private Avaliacao[] avs;

    public Turma(String nome, int ano, int semestre, Professor professor, Aluno[] alunos, Avaliacao[] avs) {
        this.nome = nome;
        this.ano = ano;
        this.semestre = semestre;
        this.professor = professor;
        this.alunos = alunos;
        this.avs = avs;
    }

    public void medias() {
        int h = getAvs().length;
        System.out.println("Médias da Turma " + getNome() + "(" + getAno() + "/" + getSemestre() + "):");
        double somaGeral = 0;
        for(int i = 0; i < getAlunos().length; i++) {
            Aluno aln = getAlunos()[i];
            double soma = 0;
            System.out.print(aln.toString() + ": ");
            for (int j = 0; j < getAvs().length; j++) {
                double nt = getAvs()[j].nota(i);
                System.out.print(getAvs()[j].nota(i) + " ");
                soma += getAvs()[j].nota(i);
            }
            if(soma > 100) soma = 100;
            System.out.print(" = " + soma);
            System.out.println();
            somaGeral += soma;
        }
        System.out.println("Média da turma: " + (somaGeral / getAlunos().length));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Avaliacao[] getAvs() {
        return avs;
    }

    public void setAvs(Avaliacao[] avs) {
        this.avs = avs;
    }
}
