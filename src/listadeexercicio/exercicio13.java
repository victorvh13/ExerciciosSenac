/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicio;

import java.text.Normalizer;

/**
 *
 * @author victor.7455
 */ // exercicio contar vogais
public class exercicio13 {
    
        public static void main(String[] args) {
        
            char[] vogais = {'a', 'e', 'i', 'o', 'u'}; // char junto com {} permite declarar variáveis com mais de um valor
        
            String texto = "Victor Higo Alves de Sousa";
            
            texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
            
            int contVogais = 0;
            for (int i = 0; i < texto.length(); i++){
                for (int j = 0; j < vogais.length; j++) {
                    if (texto.toLowerCase().charAt(i) == vogais [j]){
                        contVogais++;
                        break;
                    }
               }
        }
        
           System.out.println ("Total de vogais:" + contVogais);
        } 
 }
