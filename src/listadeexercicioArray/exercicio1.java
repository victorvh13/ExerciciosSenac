/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicioArray;

/**
 *
 * @author victor.7455
 */
public class exercicio1 {
    public static void main(String[] args) {
    int [] numeros = new int[10]; // o new int[5] é a quantidade de posições do array
    
    // [0] determina o array e "= 1" é o valor atribuido para aquela posição 
    numeros [0] = 100;
    numeros [1] = 244;
    numeros [2] = 335;
    numeros [3] = 449;
    numeros [4] = 513;
    numeros [5] = 463;
    numeros [6] = 783;
    numeros [7] = 463;
    numeros [8] = 561;
    numeros [9] = 642;
    
    
        System.err.println(numeros[2] + numeros[4]);
        
        int i = 0; // i é indice
        //lenght serve para determinar que será feito pelo total de posições existentes no array, logo ele pega todos os dados do array
        while (i < numeros.length){  //while é estrutura de repetição e entre parenteses está a condição para fechar a repetição
             System.out.println(numeros [i]);  // em System.err.println(nomes [i]); (nomes [i]) serve para exibir tudo que estiver no array
             i++;
        
        
        }
    
    }
    
    
}

