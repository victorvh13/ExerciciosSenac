/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicio;
import java.util.Scanner;
/**
 *
 * @author victor.7455
 */ //

public class exercicio7 {
    
         // calcule o fatorial ex: 5 * 4* 3 * 2 * 1
          public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           int num, numFixo, fatorial;
           
           System.out.println("Informe um número que deseja o fatorial:");
           num = scanner.nextInt();
           
           fatorial = num;
           numFixo = num;
           
           while(num > 1) {
               System.out.println(fatorial + "x" + (num -1) + "=" + (fatorial* (num - 1)));
               
               fatorial *= (num -1);
               
               num--; // acresntar os números em ordem decrescente
           }
           
           
           System.out.println ("O fatorial de " + numFixo + "é" + fatorial);
           
          }
          

}
