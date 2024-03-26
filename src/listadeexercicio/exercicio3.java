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
public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Informe um número para verificar se é impar ou par");
        int numero = scanner.nextInt();
        
        // %2==0 serve para determinar se o número é par, if significa se e else é utilizado para "se não foi o primeiro é o segundo
        if (numero %2==0) { 
            System.err.println(numero + "numero é par");
        } else {
            System.err.println(numero + "numero é impar");    
        }
        // scanner.close(); serve para parar o scanner 
        scanner.close();
        
    }
}

