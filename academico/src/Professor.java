import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Professor extends Pessoa{
    private double salario;

    public Professor(String nome, String cpf, double salario) {
        super(nome, cpf);
        setSalario(salario);

        System.out.println("Professor cadastrado com sucesso!");
    }

    public Professor(BufferedReader b){
        try {
            this.nome = b.readLine();
            this.cpf = b.readLine();
            this.salario = Double.parseDouble(b.readLine());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void salvarArq(BufferedWriter b) throws IOException{
        b.write(getNome() + "\n");
        b.write(getCpf() + "\n");
        b.write(getSalario() + "\n");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
