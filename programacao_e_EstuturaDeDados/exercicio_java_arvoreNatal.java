// ctrol + shift + M para ver erros de sintaxe, 
// ctrl + shift + F para formatar o código, 
// ctrl + shift + O para organizar os imports

public class exercicio_java_arvoreNatal {
        
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) { // Loop externo para as linhas da árvore
            for (int j = 1; j <= 5 - i; j++) { // Loop interno para os espaços em branco
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Loop interno para os asteriscos
                System.out.print("*");
            }
            System.out.println(); // Pula para a próxima linha após imprimir cada linha da árvore
        }
    }                       
}
