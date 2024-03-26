/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicio;
import java.util.Scanner;
/**
 *
 * @author victor.7455
 */ // converter celsius para fahrenheit
public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //pedi para usuário informar a temperatura
        System.out.println("Informe a temperatura em Celsius");
        
        //declarei variáveis com float para usar na fórmula de cálculo da conversão
        float celsius = scanner.nextFloat();
        float a = 1.8f; //usar f depois do número quando o float não funcionar em número não inteiro
        int b = 32;
        
        // apliquei a formula de cálculo da conversão de celsius para fahrenheit
        System.out.println("Temperatura em Fahrenheit:" + celsius * a + b);
        
        
       
                }
        
}
