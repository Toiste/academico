import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int d, int m, int a) {
        setDia(d);
        setMes(m);
        setAno(a);
    }

    public boolean posterior(Data dt) {
        if (getAno() > dt.getAno()) return true;
        if (getAno() < dt.getAno()) return false;
        if (getMes() > dt.getMes()) return true;
        if (getMes() < dt.getMes()) return false;
        return getDia() > dt.getDia();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


}
