// programa que tem uma funcao que calcula a tabuada do numero fornecido pelo usuario.

import java.util.Scanner;

public class exercicio_java_funcao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular a tabuada: ");
        int numero = scanner.nextInt();
        calcularTabuada(numero);
        scanner.close();
    }

    public static void calcularTabuada(int numero) {
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

