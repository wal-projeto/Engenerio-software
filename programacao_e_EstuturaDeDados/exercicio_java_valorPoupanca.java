/*Programa que recebe o valor de um deposito em poupança e 
calcula e mostra o rendimento após um mês de aplicação, sabendo
que a poupança rende 5% ao mÊs  */

import java.util.Scanner;

public class exercicio_java_valorPoupanca {

    public static void main(String[] args)  {

    Scanner entrada = new Scanner (System.in);
    double deposito = 0;
    double rendimento;
    double valorRendimento;
    final double TAXA_RENDIMENTO = 0.05;


    System.out.println("== Calculo de Rendimento da Poupança em um mês===");
    System.out.print("Digite o valor do deposito: ");

    deposito = entrada.nextDouble();
    
    valorRendimento = deposito * TAXA_RENDIMENTO;

    rendimento = deposito + (deposito * TAXA_RENDIMENTO);

    System.out.printf("O Rendimento de %.2f depositado em um mês é de %.2f  dando um Total de: %.2f" , deposito, valorRendimento, rendimento);
    entrada.close();
    }
}


