public class AlunoTrab {
    private Aluno aluno;
    private double nota;
    private Data dtEntrega;
    private int tempoExec;

    public AlunoTrab(Aluno aluno, double nota, Data dtEntrega, int tempoExec) {
        setAluno(aluno);
        setNota(nota);
        setDtEntrega(dtEntrega);
        setTempoExec(tempoExec);
    }

    public double notaTotal(Data prazo, int tempoEsp, double valor) {
        if (getDtEntrega().posterior(prazo)) {
            return getNota()*80/100;
        } else if (getNota()==valor && tempoEsp > tempoExec) {
            return getNota()+2;
        }
        return getNota();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Data getDtEntrega() {
        return dtEntrega;
    }

    public void setDtEntrega(Data dtEntrega) {
        this.dtEntrega = dtEntrega;
    }

    public int getTempoExec() {
        return tempoExec;
    }

    public void setTempoExec(int tempoExec) {
        this.tempoExec = tempoExec;
    }
}
