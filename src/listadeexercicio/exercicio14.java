/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicio;

/**
 *
 * @author victor.7455
 */ //verificar se uma palavra é palimdromo 

public class exercicio14 {
    public static void main(String[] args) {
        //Nesta linha declarou-se uma variavel do tipo string "texto"
        String palavra = "arara";
        
        //o conteudo da variavel "palavra" foi convertido para minúsculo
        palavra = palavra.toLowerCase();
        
        //.length serve contar o tamanho da variável, no caso de arara é 5
        int lenPalavra = palavra.length();
        
        //// char junto com {} permite declarar variáveis com mais de um valor
        char charFrente, charTras;
        
        // boolean serve para criar um teste de verdadeiro ou falso
        boolean palindromo = true;
        for (int i = 0; i < lenPalavra; i++) {
            charFrente = palavra.charAt(i);
            charTras = palavra.charAt(lenPalavra - i - 1);
            // foi criado um teste determinando que se charFrente (palavra escrita normalmen) for diferente de charTras 
            //palavra escrita de trás para frente forem diferentes o resultado do teste será falso
            
            if (charFrente != charTras){
                palindromo = false;
                break;
            }
            }
        //if (se) for um palindromo exibir a primeira mensagem, se não for exibir a segunda
        if (palindromo) {
            System.out.println("A palavra " + palavra + " é um palindromo");
        } else {System.out.println("A palavra " + palavra + " não é um palindromo");
        
        }
            
        }
        
        
}
