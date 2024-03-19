import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Aluno extends Pessoa{
    private String mat;

    public Aluno(String nome, String cpf, String mat) {
        super(nome, cpf);
        this.mat = mat;
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public Aluno(BufferedReader b){
        try {
            this.nome = b.readLine();
            this.cpf = b.readLine();
            this.mat = b.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void salvarArq(BufferedWriter b) throws IOException{
        b.write(getNome() + "\n");
        b.write(getCpf() + "\n");
        b.write(getMat() + "\n");
    }

    public String toString() {
        return (getNome() + " (Matrícula: " + getMat() + ")");
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }
}
