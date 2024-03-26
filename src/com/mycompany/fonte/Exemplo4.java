/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fonte;

import java.util.Scanner;

/**
 *
 * @author victor.7455
 */
public class Exemplo4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int num1, num2;
        
        System.out.println("Informe o primeiro número: ");
        num1 = scanner.nextInt();
        
        System.out.println("Informe o segundo número: ");
        num2 = scanner.nextInt();
        
        System.out.println("Resultado:"+(num1 + num2));
    }
    
}
