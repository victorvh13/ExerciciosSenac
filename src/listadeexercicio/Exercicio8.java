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
public class Exercicio8 {
    
    // identificar se um número é ou não primo
    
    public static void main(String[] args) {
       
        System.out.println("Informe o número: ");
        int num = new Scanner (System.in).nextInt();
                
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                 System.out.println("O número" + num + " não é primo");
                 System.exit(0);
            }
        }
        
        System.out.println("O número" + num + " É primo");
}
    
}
