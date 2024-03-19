// package Notas;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Classe principal
 * @author Hilario Seibel Junior
 */
public class Main {
    public static void main(String[] args){
        Entrada io = new Entrada();
        Sistema s = new Sistema();
        int op;

        op = io.menu1();

        while (op != 0) {
            if (op == 1) {
                io.cadProf(s);
                s.salvarProfsArq();
            }
            if (op == 2) {
                io.cadAluno(s);
                s.salvarAlunosArq();
            }
            if (op == 3) {
                Turma t = io.cadTurma(s);
                s.novaTurma(t);
            }
            if (op == 4) {
                s.listarMedias();
            }


            op = io.menu1();
        }

    }
}