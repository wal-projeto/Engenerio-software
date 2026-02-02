/**
 * Programa para calcular a nota final dos alunos.
 * 
 * FUNCIONALIDADE:
 * Este programa solicita ao usuário três notas, calcula a média aritmética
 * e determina a situação do aluno com base na média obtida.
 * 
 * REGRAS DE AVALIAÇÃO:
 * - Média >= 6.0: Aprovado (passou de ano)
 * - Média >= 4.0 e < 6.0: Recuperação
 * - Média < 4.0: Reprovado
 * 
 * ENTRADA:
 * - Três notas informadas pelo usuário (double)
 * 
 * SAÍDA:
 * - Mensagem com a situação do aluno e sua média final formatada com 2 casas decimais
 * 
 * @author Curso de Programação
 * @version 1.0
 */

package programacao_e_EstuturaDeDados; // Define o pacote onde a classe está localizada

import java.util.InputMismatchException;
import java.util.Scanner; // Importa a classe Scanner leitura de dados do para usuário

public class exercicio_java_condicional1 { // Declaração da

    public static void main(String[] args) { // Método principal, ponto de entrada do classe pública programa

        // Cria um objeto Scanner para ler entrada do teclado
        Scanner entrada = new Scanner(System.in);

        // Declaração das variáveis para armazenar as notas e a média
        float nota1 = 0, nota2 = 0, nota3 = 0, media = 0;
        
        // Exibe título do programa no console
        System.out.println("=== Calculo da Media Final dos Alunos ===");
        
        // Solicita e lê a primeira nota do usuário , DEVERÁ SER FORNECIDA COM VIRGULA NO BRASIL : 5,9  ,  8,7 , etc
        System.out.print("Digite a primeira nota: ");
        try {
            nota1 = entrada.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite um número válido!");
            entrada.next(); // Limpa o buffer do scanner
            return; // Encerra o programa
        }
        
        // Solicita e lê a segunda nota do usuário: EVERÁ SER FORNECIDA COM VIRGULA NO BRASIL : 4,9 , 5,7 , etc
        System.out.print("Digite a segunda nota: ");
        try {
            nota2 = entrada.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite um número válido!");
            entrada.next();
            return;
        }
        
        // Solicita e lê a terceira nota do usuário: EVERÁ SER FORNECIDA COM VIRGULA NO BRASIL : 9,7 , 8,2 , etc
        System.out.print("Digite a terceira nota: ");
        try {
            nota3 = entrada.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite um número válido!");
            entrada.next();
            return;
        }

        // Calcula a média: soma as três notas e divide por 3
        media = (nota1 + nota2 + nota3) / 3;

        // Verifica se o aluno foi aprovado (média maior ou igual a 6)
        if (media >= 6.0) {
            // Exibe mensagem de parabéns com a média formatada
            System.out.printf("Parabéns você passou de ano com a media %.2f\n", media);
        }
        // Verifica se o aluno está de recuperação (média entre 4 e 5.9)
        else if (media >= 4.0) {
            // Exibe mensagem de recuperação com a média formatada
            System.out.printf("Você está de recuperação, sua media foi %.2f\n", media);
        }
        // Caso contrário, o aluno foi reprovado (média menor que 4)
        else {
            // Exibe mensagem de reprovação com a média formatada
            System.out.printf("Infelizmente você não passou de ano, sua media foi %.2f\n", media);
        }

        // Fecha o Scanner para liberar recursos
        entrada.close();

    }
}
