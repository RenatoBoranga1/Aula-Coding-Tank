package exercicio1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = solicitarDados(entrada, "Digite seu nome: ");
        String endereco = solicitarDados(entrada, "Digite seu endereço: ");
        String profissao = solicitarDados(entrada, "Digite sua profissão: ");
        String email = solicitarDados(entrada, "Digite seu email: ");
        String dataNascimento = solicitarDados(entrada, "Digite sua data de nascimento (dd/mm/yyyy): ");

        imprimirDados(nome, dataNascimento, endereco, profissao, email);

        entrada.close();
    }

    public static String solicitarDados(Scanner input, String dadosSolicitado) {
        System.out.print(dadosSolicitado);
        return input.nextLine();
    }

    public static void imprimirDados(String nome, String dataNascimento, String endereco, String profissao, String email) {
        System.out.println("\nPessoa:");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Endereço: " + endereco);
        System.out.println("Profissão: " + profissao);
        System.out.println("Email: " + email);
    }
}
