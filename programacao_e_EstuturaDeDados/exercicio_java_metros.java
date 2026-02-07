/**
 * 
 * INSTRUÇÕES PARA COMPILAR E EXECUTAR O PROGRAMA JAVA:
    cd programacao_e_EstuturaDeDados
    Digite no terminal : javac exercicio_java_metros.java   # Compila
    Depois digite :      java exercicio_java_metros   # Executa

    ou ABRA O ARQUIVO JAVA E CLIQUE EM "RUN" NO SEU IDE

    ou PRESSIONA F5 NO SEU IDE PARA RODAR O PROGRAMA

*Programa para converter metros para centimetros
 * Conceitos aprendidos:
 * - Declaracao de variaveis
 * - Entrada de dados do usuario
 * - Operacoes matematicas
 * - Impressao de resultados
 * - Comentarios para documentacao
 

Prorama que calcual a conversão de metros para centimetros
 */


import java.util.Scanner; // Importa a classe Scanner para ler entrada do usuário

public class exercicio_java_metros {
    
    public static void main(String[] args) {
        /**
         * Método principal onde o programa começa a execução
         * 
         * FATOR DE CONVERSÃO:
         * 1 metro = 100 centímetros
         */
        
        // Criando um objeto Scanner para ler dados do teclado
        Scanner entrada = new Scanner(System.in);
        
        // Declarando variável para armazenar o valor em metros
        // double é usado para números com casas decimais
        double metros;
        
        // Declarando variável para armazenar o resultado em centímetros
        double centimetros;
        
        // Variável constante para o fator de conversão
        // final significa que o valor não pode ser alterado
        final double FATOR_CONVERSAO = 100.0;
        
        // Imprimindo mensagem para o usuário
        System.out.println("=== Conversor de Metros para Centimetros ===");
        System.out.print("Digite o valor em metros: ");
        
        // Lendo o valor digitado pelo usuário e armazenando na variável metros: no java digito com virgula
        // os numeros decimais. exemplo 2,8  3,9 etc
        metros = entrada.nextDouble();
        
        // Calculando a conversão: metros * fator de conversão
        centimetros = metros * FATOR_CONVERSAO;
        
        // Exibindo o resultado para o usuário
        // Usamos %.2f para formatar o número com 2 casas decimais
        System.out.printf("%.2f metros = %.2f centimetros%n", metros, centimetros);
        
        // Fechando o Scanner para liberar recursos
        entrada.close();
    }
}

/**
 * RESUMO DOS CONCEITOS APRENDIDOS:
 * 
 * 1. VARIAVEIS:
 *    - double: tipo de dados para numeros decimais (com virgula)
 *    - final: cria uma constante (valor que nao muda)
 * 
 * 2. ENTRADA DE DADOS:
 *    - Scanner: classe que permite ler dados do teclado
 *    - nextDouble(): metodo que le um numero decimal
 * 
 * 3. OPERACOES MATEMATICAS:
 *    - Multiplicacao (*): metros * 100
 * 
 * 4. SAIDA DE DADOS:
 *    - System.out.println(): imprime com quebra de linha
 *    - System.out.printf(): permite formatacao (%.2f)
 * 
 * 5. COMENTARIOS:
 *    - // para comentario de uma linha
 *    -  asterisco-barra para comentario de multiplas linhas
 *    -  asterisco-asterisco para documentacao (Javadoc)
 */
