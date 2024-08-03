package aluno;

import java.util.ArrayList;
import java.util.List;

public class CadastroAluno {
    private List<Aluno> alunos;

    public CadastroAluno() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> listarAlunos() {
        return alunos;
    }

    public Aluno buscarAlunoPorNome(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }
}
