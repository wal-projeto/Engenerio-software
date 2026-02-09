/**
 * Elabore um programa em java que leia uma lista de 10 valores numéricos inteiros quaisquer.
 * Escreva na tela o maior e o menor valor informado.
 */

// Importação da classe Scanner para leitura de dados do usuário via teclado
import java.util.Scanner;

// Definição da classe principal do programa
public class exercicio_java_array {
    // Método principal - ponto de entrada do programa
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler entrada do usuário
        Scanner entrada = new Scanner(System.in);
        
        // Declaração e inicialização de um array de inteiros com capacidade para 10 elementos
        int[] numeros = new int[10];

        // Estrutura de repetição FOR para ler os 10 números
        // O loop inicia em 0 e vai até 9 (condição i < 10)
        for (int i = 0; i < 10; i++) {
            // Exibe mensagem solicitando um número ao usuário
            System.out.print("Digite um número inteiro: ");
            // Lê o número informado pelo usuário e armazena na posição i do array
            numeros[i] = entrada.nextInt();
        }

        // Inicialização das variáveis maior e menor com o primeiro elemento do array
        // Isso é feito pois ainda não sabemos quais são os valores extremos
        int maior = numeros[0];
        int menor = numeros[0];

        // Estrutura de repetição FOR para percorrer o array e encontrar maior e menor
        // Começa em 1 pois já usamos o índice 0 para inicializar as variáveis
        for (int i = 1; i < 10; i++) {
            // Verifica se o elemento atual é maior que o maior valor encontrado até agora
            if (numeros[i] > maior) {
                // Se sim, atualiza a variável maior com o novo valor
                maior = numeros[i];
            }
            // Verifica se o elemento atual é menor que o menor valor encontrado até agora
            if (numeros[i] < menor) {
                // Se sim, atualiza a variável menor com o novo valor
                menor = numeros[i];
            }
        }

        // Exibe o maior valor encontrado na tela
        System.out.println("Maior valor: " + maior);
        // Exibe o menor valor encontrado na tela
        System.out.println("Menor valor: " + menor);
        
        // Fecha o objeto Scanner para liberar os recursos do sistema
        entrada.close();
    }
}
