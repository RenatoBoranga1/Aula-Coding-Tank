package aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Buscar Aluno");
            System.out.println("0. Sair");
            opcao = input.nextInt();
            input.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    cadastrarAluno(cadastro, input);
                    break;
                case 2:
                    listarAlunos(cadastro);
                    break;
                case 3:
                    buscarAluno(cadastro, input);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        input.close();
    }

    private static void cadastrarAluno(CadastroAluno cadastro, Scanner input) {
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Idade: ");
        int idade = input.nextInt();
        input.nextLine(); 
        System.out.print("Matrícula: ");
        String matricula = input.nextLine();
        System.out.print("Curso: ");
        String curso = input.nextLine();

        Aluno aluno = new Aluno(nome, idade, matricula, curso);
        cadastro.adicionarAluno(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    private static void listarAlunos(CadastroAluno cadastro) {
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : cadastro.listarAlunos()) {
            System.out.printf("Nome: %s, Idade: %d, Matrícula: %s, Curso: %s\n",
                    aluno.getNome(), aluno.getIdade(), aluno.getMatricula(), aluno.getCurso());
        }
    }

    private static void buscarAluno(CadastroAluno cadastro, Scanner input) {
        System.out.print("Nome do Aluno: ");
        String nome = input.nextLine();
        Aluno aluno = cadastro.buscarAlunoPorNome(nome);
        if (aluno != null) {
            System.out.printf("Nome: %s, Idade: %d, Matrícula: %s, Curso: %s\n",
                    aluno.getNome(), aluno.getIdade(), aluno.getMatricula(), aluno.getCurso());
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }
}
