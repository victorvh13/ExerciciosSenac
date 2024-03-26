/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicio;
import java.util.Scanner;
/**
 *
 * @author victor.7455
 */   //Exercício 19: Calculadora de Média Ponderada
public class exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe o peso da primeira nota:");
        double peso1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Informe o peso da segunda nota:");
        double peso2 = scanner.nextDouble();

        System.out.println("Informe a terceira nota:");
        double nota3 = scanner.nextDouble();

        System.out.println("Informe o peso da terceira nota:");
        double peso3 = scanner.nextDouble();

        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println("A média ponderada é: " + mediaPonderada);
    }
}


