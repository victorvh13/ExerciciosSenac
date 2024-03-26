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
public class exercicio9 {
    
//
     public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           
           int maximo;
           int primeiroNumero = 0, segundoNumero = 1, proximoNumero;
           
           System.out.println("Informe um número de repetições");
           maximo = scanner.nextInt();
           
            System.out.println("=======FIBONACCI========");
            System.out.println(primeiroNumero);
            System.out.println(segundoNumero);
            
            //o	Esta linha inicia um loop for que irá iterar maximo vezes. A variável i é usada como contador do loop.
            for(int i = 0; i < maximo; i++) {
                proximoNumero = primeiroNumero + segundoNumero;
                
                System.out.println(proximoNumero);
                
                primeiroNumero = segundoNumero;
                segundoNumero = primeiroNumero;
            }
           //•	int primeiroNumero = 0, segundoNumero = 1, proximoNumero;
           //Esta linha declara três variáveis do tipo int:
	//primeiroNumero é inicializada com o valor 0, que é o primeiro termo da sequência de Fibonacci.
	//segundoNumero é inicializada com o valor 1, que é o segundo termo da sequência de Fibonacci.
	//proximoNumero será usada para armazenar o próximo termo da sequência.

           
    }
}
