package array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Informe a quantidade de provas: ");
            int numProvas = scanner.nextInt();

            
            int[] notas = new int[numProvas];
            int soma = 0;
            int menorNota = 100;
            int maiorNota = 0;

            
            for (int i = 0; i < numProvas; i++) {
                System.out.printf("Informe a nota da prova %d: ", i + 1);
                notas[i] = scanner.nextInt();

        
                soma += notas[i];

               
                if (notas[i] < menorNota) {
                    menorNota = notas[i];
                }
                if (notas[i] > maiorNota) {
                    maiorNota = notas[i];
                }
            }

            
            double media = (double) soma / numProvas;

           
            System.out.printf("A menor nota é: %d%n", menorNota);
            System.out.printf("A maior nota é: %d%n", maiorNota);
            System.out.printf("A média das notas é: %.2f%n", media);
        }
    }
}
