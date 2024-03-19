import java.util.Scanner;

public class Prova extends Avaliacao{
    private int nQuestoes;
    private AlunoProva[] notas;

    public Prova(String nome, Data dtAplic, double valor, int nQuestoes, AlunoProva[] notas) {
        super(nome, dtAplic, valor);
        setnQuestoes(nQuestoes);
        setNotas(notas);
    }

    public double nota(int n) {
        return getNotas()[n].notaTotal();
    }

    public int getnQuestoes() {
        return nQuestoes;
    }

    public void setnQuestoes(int nQuestoes) {
        this.nQuestoes = nQuestoes;
    }

    public AlunoProva[] getNotas() {
        return notas;
    }

    public void setNotas(AlunoProva[] notas) {
        this.notas = notas;
    }
}
