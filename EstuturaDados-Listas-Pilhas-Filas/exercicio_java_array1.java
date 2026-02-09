// Sabendo que a média de aprovação em uma disciplina é 6, elabore um programa em java que leia uma lista de 10 notas de alunos.
// Logo a seguir, apresente na tela a quantidade de alunos que obtiveram aprovação e a quantidade de alunos
// que ficaram de recuperação na disciplina.

import java.util.Scanner;

public class exercicio_java_array1 {
    public static void main(String[] args) {
        // Criação do objeto Scanner para receber dados do usuário via teclado
        Scanner entrada = new Scanner(System.in);
        
        // Array para armazenar as notas de 10 alunos
        double[] notas = new double[10];
        
        // Contadores para controlar a quantidade de alunos aprovados e em recuperação
        int alunosAprovados = 0;
        int alunosRecuperacao = 0;

        // Loop for para ler as 10 notas dos alunos, quando terminar de ler as 10 notas vai para o prox loop
        for (int i = 0; i < 10; i++) {
            // Solicita ao usuário que digite a nota do aluno (i + 1 para começar do 1)
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            // Armazena a nota digitada na posição i do array
            notas[i] = entrada.nextDouble();
        }

        // Loop foreach para percorrer todas as notas e classificar os alunos
        for (double nota : notas) {
            // Verifica se a nota é maior ou igual a 6 (média de aprovação)
            if (nota >= 6) {
                // Incrementa o contador de alunos aprovados
                alunosAprovados++;
            } else {
                // Caso contrário, o aluno está em recuperação
                alunosRecuperacao++;
            }
        }

        // Exibe na tela a quantidade de alunos aprovados
        System.out.println("Quantidade de alunos aprovados: " + alunosAprovados);
        // Exibe na tela a quantidade de alunos em recuperação
        System.out.println("Quantidade de alunos de recuperação: " + alunosRecuperacao);

        // Fecha o objeto Scanner para liberar os recursos
        entrada.close();
    }
}