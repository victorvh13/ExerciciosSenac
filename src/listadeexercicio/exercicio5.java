/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicio;
import java.util.Scanner;

/**
 *
 * @author victor.7455
 */ //Exercício 5: Contagem Regressiva (While)
public class exercicio5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para iniciar a contagem regressiva:");
        int numero = scanner.nextInt();
        
        // código para fazer contagem regrassiva até zero
        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }

        System.out.println("Contagem regressiva concluída!");
    }
}




