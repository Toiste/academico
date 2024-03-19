import java.io.*;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Professor> profs;
    private ArrayList<Aluno> alunos;
    private ArrayList<Turma> turmas;
    private final String arqAlunos;
    private final String arqProfs;


    public Sistema() {
        this.profs = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.turmas = new ArrayList<>();

        this.arqAlunos = "academico/alunos.txt";
        this.arqProfs = "academico/professor.txt";


        lerArquivoAlunos();
        lerArquivoProfs();
    }

    private void lerArquivoAlunos() {
        try {
            FileReader fAlunos = new FileReader(arqAlunos);
            BufferedReader buffAlunos = new BufferedReader(fAlunos);
            int qtdAlunos = Integer.parseInt(buffAlunos.readLine());

            for( int i = 0; i < qtdAlunos; i++) {
                alunos.add(new Aluno(buffAlunos));
            }
            System.out.println("Alunos carregados com sucesso.");
        }
        catch(IOException e){
            this.alunos = new ArrayList<>();
            System.out.println("Nenhum aluno carregado.");
        }
    }

    private void lerArquivoProfs() {
        try {
            FileReader f = new FileReader(arqProfs);
            BufferedReader b = new BufferedReader(f);
            int qtd = Integer.parseInt(b.readLine());

            for( int i = 0; i < qtd; i++) {
                profs.add(new Professor(b));
            }
            System.out.println("Professores carregados com sucesso.");
        }
        catch(IOException e){
            this.profs = new ArrayList<>();
            System.out.println("Nenhum professor carregado.");
        }
    }

    public void salvarAlunosArq(){
        try {
            FileWriter f = new FileWriter(arqAlunos);
            BufferedWriter buff = new BufferedWriter(f);

            buff.write(this.alunos.size() + "\n");

            for (Aluno a : alunos) {
                a.salvarArq(buff);
            }

            buff.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo de alunos.");
        }
    }

    public void salvarProfsArq(){
        try {
            FileWriter f = new FileWriter(arqProfs);
            BufferedWriter buff = new BufferedWriter(f);

            buff.write(this.profs.size() + "\n");

            for (Professor p : profs) {
                p.salvarArq(buff);
            }

            buff.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo de professores.");
        }
    }

    public void novoProf(Professor p) {
        profs.add(p);
    }

    public void novoAluno(Aluno a) {
        alunos.add(a);
    }

    public void novaTurma(Turma t) {
        turmas.add(t);
    }

    public Professor encontrarProfessor(String cpf) {
        for ( int i = 0; i < profs.size(); i++) {
            Professor prof = getProfs().get(i);

            if(prof.getCpf().equals(cpf)) {
                return prof;
            }
        }
        return null;
    }

    public void listarProfs() {
        if (profs.isEmpty()) {
            System.out.println("Nenhum professor cadastrado até agora.");
        } else {
            System.out.println("Professores cadastrados: ");
            for (int i = 0; i < profs.size(); i++) {
                Professor prof = getProfs().get(i);
                System.out.println(prof.toString());
            }
        }
        System.out.println();
    }

    public Aluno encontrarAluno(String matr){
        for ( int i = 0; i < alunos.size(); i++) {
            Aluno aln = getAlunos().get(i);

            if(aln.getMat().equals(matr)) {
                return aln;
            }
        }
        return null;
    }

    public void listarAlunos() {
        if(alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado até agora.");
        } else {
            System.out.println("Alunos cadastrados: ");
            for ( int i = 0; i < alunos.size(); i++) {
                Aluno aln = getAlunos().get(i);
                System.out.println(aln.toString());
            }
        }
        System.out.println();
    }

    public void listarMedias() {
        for (Turma t : turmas) {
            System.out.println("========================================");
            t.medias();
        }
        System.out.println("========================================");
    }

    public void setProfs(ArrayList<Professor> p) { this.profs = p;}

    public ArrayList<Professor> getProfs() { return profs;}

    public void setAlunos(ArrayList<Aluno> p) { this.alunos = p;}

    public ArrayList<Aluno> getAlunos() { return alunos;}

}
