package operacaoMatematica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a operação (+, -, *, /): ");
        String operacaoStr = scanner.next();
        OperacaoMatematica operacao = OperacaoMatematica.String(operacaoStr);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = operacao.operacao(num1, num2);
        System.out.printf("Resultado: %.2f %s %.2f = %.2f%n", num1, operacaoStr, num2, resultado);

        scanner.close();
    }
}
