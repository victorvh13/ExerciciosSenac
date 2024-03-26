/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicio;
import java.util.Scanner;
/**
 *
 * @author victor.7455
 */ //Exercício 15: Média de Notas
public class exercicio15 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as notas do aluno:");

        double soma = 0;
        int quantidadeNotas = 0;

        while (scanner.hasNextDouble()) {
            double nota = scanner.nextDouble();
            soma += nota;
            quantidadeNotas++;
        }

        double media = soma / quantidadeNotas;

        System.out.println("Média das notas: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}


