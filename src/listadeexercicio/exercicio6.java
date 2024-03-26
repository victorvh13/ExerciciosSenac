/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicio;
import java.util.Scanner;
/**
 *
 * @author victor.7455
 */  //Exercício 6: Tabuada
public class exercicio6 {
    
    
          public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para exibir a tabuada:");
        int numero = scanner.nextInt();

        //Esta linha inicia um loop for que irá iterar de 1 a 10 (inclusive). A variável i é usada como contador do loop.
        for (int i = 1; i <= 10; i++) {
            
        //o	Esta linha dentro do loop for imprime a tabuada do número digitado pelo usuário.
	//numero + " x " + i concatena o valor da variável numero, "x" e o valor da variável i.
	//(numero * i) calcula o produto de numero e i.
	//O resultado da multiplicação é concatenado com " = " para formar a string completa que será impressa.

            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}


