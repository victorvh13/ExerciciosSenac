/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicio;
import java.util.Scanner;
/**
 *
 * @author victor.7455
 */   // Exercício 18: Calendário Básico
public class exercicio18 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o mês:");
        int mes = scanner.nextInt();

        System.out.println("Informe o ano:");
        int ano = scanner.nextInt();

        int diasNoMes = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ? 29 : 28;
            default -> 0; // Mês inválido
        };

        System.out.println("O mês " + mes + " do ano " + ano + " possui " + diasNoMes + " dias.");
    }

}
