//Programa com funcao para pilha: Empilhar, verificaCheia, verificaVazia, empilha, desempilha, imprimir pilha

import java.util.Scanner;

public class exercicio_java_funcao_pilha {
    static int topo = -1; // definicao do topo da pilha, que é -1 quando a pilha está vazia, ou seja, não há elementos na pilha
    static int max = 5; // definicao do tamanho maximo da pilha, que é 5 nesse caso
    static int[] pilha = new int[max]; // declaracao da pilha, que é um vetor de inteiros com tamanho maximo definido pela variavel max

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Empilhar");
            System.out.println("2. Verificar se a pilha está cheia");
            System.out.println("3. Verificar se a pilha está vazia");
            System.out.println("4. Desempilhar");
            System.out.println("5. Imprimir Pilha");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número para empilhar: ");
                    int valor = sc.nextInt();
                    empilhar(valor);
                    break;
                case 2:
                    verificaCheia();
                    break;
                case 3:
                    verificaVazia();
                    break;
                case 4:
                    desempilhar();
                    break;
                case 5:
                    imprimirPilha();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);

        sc.close();
    }

    // topo = -1 (pilha vazia) ,  max = 5 é o tamanho da pilha:
    // topo 0 = primeiro elemento 
    // topo 1 = segundo elemento
    // topo 2 = terceiro elemento
    // topo 3 = quarto elemento
    // topo 4 = quinto elemento
    
    public static void verificaCheia() {
        if (topo == max - 1) { 
            System.out.println("A pilha está cheia!"); // SE TOPO=4  ==  max-1 (5-1=4) ENTÃO A PILHA ESTÁ CHEIA:
        } else {
            System.out.println("A pilha não está cheia.\n");
        }
    } 

    public static void verificaVazia() {
        if (topo == -1) {
            System.out.println("A pilha está vazia!"); // SE TOPO=-1 ENTÃO A PILHA ESTÁ VAZIA, POIS O TOPO INICIA COM -1 E SÓ AUMENTA QUANDO EMPILHAMOS UM ELEMENTO.
        } else {
            System.out.println("A pilha não está vazia.\n");
        }
    }   
    public static void empilhar(int valor) {
        if (topo < max - 1) {  // SE O TOPO FOR MENOR QUE O MAX-1 (4), ENTÃO A PILHA NÃO ESTÁ CHEIA E PODEMOS EMPILHAR UM NOVO ELEMENTO. SE O TOPO FOR IGUAL A 4, ENTÃO A PILHA ESTÁ CHEIA E NÃO PODEMOS EMPILHAR UM NOVO ELEMENTO.
            topo++;
            pilha[topo] = valor;
            System.out.println("Valor empilhado: " + valor);
        } else {    // SE O TOPO FOR IGUAL A 4, ENTÃO A PILHA ESTÁ CHEIA E NÃO PODEMOS EMPILHAR UM NOVO ELEMENTO.
            System.out.println("Pilha cheia! Não é possível empilhar.");
        }
    }
    //quando desempilhamos o topo diminui, ou seja, o valor do topo é o valor do elemento que foi desempilhado, e o topo passa a apontar para o próximo elemento da pilha, 
    // que é o elemento que estava abaixo do elemento desempilhado.
    public static void desempilhar() {
        if (topo >= 0) {  // SE O TOPO FOR MAIOR OU IGUAL A 0, ENTÃO A PILHA NÃO ESTÁ VAZIA E PODEMOS DESEMPILHAR UM ELEMENTO. SE O TOPO FOR -1, ENTÃO A PILHA ESTÁ VAZIA E NÃO PODEMOS DESEMPILHAR UM ELEMENTO.
            int valorDesempilhado = pilha[topo];
            topo--;
            System.out.println("Valor desempilhado: " + valorDesempilhado + ", Topo atual: " + (topo >= 0 ? pilha[topo] : "Pilha vazia"));
            // O valor desempilhado é o valor do elemento que estava no topo da pilha, e o topo atual é o valor que antecede o topo da pilha, 
            // ou seja, o elemento que estava abaixo do elemento desempilhado. Se o topo for menor que 0, significa que a pilha está vazia.
        } else {
            System.out.println("Pilha vazia! Não é possível desempilhar.\n");
        }
    }
    
    public static void imprimirPilha() {
        if (topo >= 0) {
            System.out.println("Pilha atual:");
            for (int i = topo;  i >= 0;  i--) { // Imprime do topo para a base
                System.out.println(pilha[i]);
            }
        } else {
            System.out.println("Pilha vazia!\n");
        }
    }
}