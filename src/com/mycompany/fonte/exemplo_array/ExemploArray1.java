/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fonte.exemplo_array;

/**
 *
 * @author victor.7455
 */
public class ExemploArray1 {
    public static void main(String[] args) {
    int [] numeros = new int[5]; // o new int[5] é a quantidade de posições do array
    
    // [0] determina o array e "= 1" é o valor atribuido para aquela posição 
    numeros [0] = 1;
    numeros [1] = 2;
    numeros [2] = 3;
    numeros [3] = 4;
    numeros [4] = 5;
    
        System.err.println(numeros[2] + numeros[4]);
        
        int i = 0; // i é indice
        //lenght serve para determinar que será feito pelo total de posições existentes no array, logo ele pega todos os dados do array
        while (i < numeros.length){  //while é estrutura de repetição e entre parenteses está a condição para fechar a repetição
             System.err.println("O número " + numeros [i] + " está no indice " + i);  // em System.err.println(nomes [i]); (nomes [i]) serve para exibir tudo que estiver no array
             i++;
        
        
        }
    
    }
    
    
}
