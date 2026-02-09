// Program que le um array de 10 numeros inteiros e imprime
//os numeros das posicoes impares do array

import java.util.Scanner;

public class exercicio_java_array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        // Leitura dos numeros inteiros
        System.out.println("Digite 10 numeros inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        // Imprime os numeros das posicoes impares
        System.out.println("Numeros nas posicoes impares:");
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 != 0) { // Verifica se a posicao é impar
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
