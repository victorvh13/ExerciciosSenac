/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicio;

/**
 *
 * @author victor.7455
 */ // Exercício 12: Troca de Variáveis
public class exercicio12 {
  public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Valores originais: a = " + a + ", b = " + b);
            
        // temp é usado para preservar valor de a 
        int temp = a;
        a = b;
        b = temp;
        //alterei os valores e agora estou exibindo modificados
        System.out.println("Valores trocados: a = " + a + ", b = " + b);
    }
  
}
