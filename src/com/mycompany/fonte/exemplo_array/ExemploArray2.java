/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fonte.exemplo_array;

import java.util.Scanner;

/**
 *
 * @author victor.7455
 */
public class ExemploArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String [] nomes = {"Joseph", 
            "Dio", 
            "Polo", 
            "Carlo"};
        
        System.out.println("Nome: ");
        
       String convidado = scanner.nextLine(); //para 
            
       for (int i = 0; i < nomes.length; i++) { //lenght serve para determinar que será feito pelo total de posições existentes no array, logo ele pega todos os dados do array
        if (nomes[i].equals(convidado)) {
            
            System.out.println(nomes [i] + " não é penetra"); // em System.err.println(nomes [i]); (nomes [i]) serve para exibir tudo que estiver no array
            System.exit(0);
           }
       }
    
       System.out.println ("É Penetra");
    
    }
}

