/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicio;
import java.util.Scanner;
/**
/**
 *
 * @author victor.7455
 */ // Exercício 17: Calcular IMC
public class exercicio17 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o peso (em kg):");
        double peso = scanner.nextDouble();

        System.out.println("Informe a altura (em metros):");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O Índice de Massa Corporal (IMC) é: " + imc);
    }
}


