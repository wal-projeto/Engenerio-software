/*programa lê 10 valores e apresenta na tela */


import java.util.Scanner;

public class exercicio_java_lacoRepeticao1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int valor = 0;
       int soma = 0;
       int contador = 0;

       for (contador = 1; contador <=10; contador++) {
        System.out.println("Digite um valor inteiro: ");
        valor = entrada.nextInt();
        soma = soma + valor;
        System.out.println(contador + "ª interacao = A soma dos valores digitados é: " + soma);
       }

       entrada.close();
    }
    }
