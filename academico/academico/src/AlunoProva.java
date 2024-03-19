public class AlunoProva {
    private Aluno aluno;
    private double[] notas;

    public AlunoProva(Aluno aluno, double[] notas) {
        this.aluno = aluno;
        this.notas = notas;
    }

    public double notaTotal() {
        double soma = 0;
        for (int i = 0; i < getNotas().length; i++) {
            soma += getNotas()[i];
        }
        return soma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
