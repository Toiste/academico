public class Trabalho extends Avaliacao{
    private int tempoEsp;
    private AlunoTrab[] notas;

    public Trabalho(String nome, Data dtAplic, double valor, int tempoEsp, AlunoTrab[] notas) {
        super(nome, dtAplic, valor);
        this.tempoEsp = tempoEsp;
        this.notas = notas;
    }

    public double nota(int index) {
        return getNotas()[index].notaTotal(getDtAplic(), getTempoEsp(), getValor());
    }

    public int getTempoEsp() {
        return tempoEsp;
    }

    public void setTempoEsp(int tempoEsp) {
        this.tempoEsp = tempoEsp;
    }

    public AlunoTrab[] getNotas() {
        return notas;
    }

    public void setNotas(AlunoTrab[] notas) {
        this.notas = notas;
    }
}
