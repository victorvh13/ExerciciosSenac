/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicio;

import java.util.Scanner;

/**
 *
 * @author victor.7455
 */
public class exercicio1 {
    
// escreva um algoritmo que solicite dois números ao usuário e a soma dele
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        // float para números não inteiros, declarei os dois números
        float num1, num2;
        //pedi para o usuário digitar o primeiro determinando num1
        System.out.println("Informe o primeiro número: ");
        num1 = scanner.nextFloat();
        
        //pedi para o usuário digitar o primeiro determinando num2
        System.out.println("Informe o segundo número: ");
        num2 = scanner.nextFloat();
        
        //o resultado é a soma dos dois
        System.out.println("Resultado:"+(num1 + num2));
    }
    
}

