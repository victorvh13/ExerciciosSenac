/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicio;
import java.util.Scanner;
/**
 *
 * @author victor.7455
 */ // Exercício 11: Maior e Menor Número
public class exercicio11 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de números:");
        int quantidade = scanner.nextInt();
        //código para determinar o maior valor e menor valor
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        //for cria uma repetição, nesse caso usou o primeiro número digitado para determinar quantos vezes digitaria números
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Informe o número " + i + ":");
            int numero = scanner.nextInt();
            // se número for maior o maior se torna o número
            if (numero > maior) {
                maior = numero;
            }
            // se número for menor o menor se torna o número
            if (numero < menor) {
                menor = numero;
                        }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}



