import java.util.Scanner;

public class Avaliacao {
    protected String nome;
    protected Data dtAplic;
    protected double valor;

    public Avaliacao(String nome, Data dtAplic, double valor) {
        setNome(nome);
        setDtAplic(dtAplic);
        setValor(valor);
    }

    public double nota(int index) {
        return 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDtAplic() {
        return dtAplic;
    }

    public void setDtAplic(Data dtAplic) {
        this.dtAplic = dtAplic;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
