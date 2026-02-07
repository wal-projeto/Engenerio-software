// Chico tem 1,50 metros e cresce 2 centímetros por ano, enquanto Ze tem 1,10 metros e cresce 3 centímetros por ano.
//  Escreva um programa que calcule e imprima quantos anos serão necessários para que Ze seja maior que Chico.

import java.util.Scanner;

public class exercicio_java_ZeMaiorqueChico {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double alturaChico = 1.50;
        double alturaZe = 1.10; // o ze cresce 3 cm por ano, ou seja, 0.03 metros por ano
        int anos = 0;

        while (alturaZe <= alturaChico) {
            alturaChico = alturaChico + 0.02; // o chico cresce 2 cm por ano, ou seja, 0.02 metros por ano
            alturaZe = alturaZe + 0.03; // o ze cresce 3 cm por ano, ou seja, 0.03 metros por ano
            anos++; // incrementa o número de anos a cada iteração do loop.  anos = anos + 1
        }

        System.out.println("Anos necessários para que Ze seja maior que Chico: " + anos);
        System.out.println("Altura final de Chico: " + String.format("%.2f", alturaChico) + " metros");
        System.out.println("Altura final de Ze: " + String.format("%.2f", alturaZe) + " metros");
    }
}