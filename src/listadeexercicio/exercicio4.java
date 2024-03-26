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
public class exercicio4 {
    


 
   public static void main(String[] args) 
{
        int opcao;
        float num1, num2, result; //float é para números não inteiros
        
        //scanner serve para dar opção do usuário interagir "digitar algo"
        Scanner scanner = new Scanner (System.in); 
        
        Boolean continuar = true; //variavel booleana em conjunto com while serve para fazer o programa rodar mesmo após a resposta
        
        while (continuar){ //o colchete deve fechar no final do programa
        
                //listei as opções do usuários
                System.out.println("Selecione a operação \n" +
                        "==============================\n" +
                        
                        "1 - Soma\n"+
                        "2 - Subtração\n" +
                        "3 - Multiplicação\n" + 
                        "4 - Divisão");

                //para o usuário poder digitar
                opcao = scanner.nextInt(); 

                //criar condição para o usuário poder digitar só igual ou maior que zero ou menor que quatro já que só existem quatro opções
                if(opcao <= 0 || opcao > 4) { 
                    //caso o resultado desrespeite as condições será exibido o texto opção inexistente e o system.exit fecha o sistema nesses casos
                    System.err.println("Opção Inexistente!");
                    System.exit(0);

                }
                //texto na tela e opção para o usuário digitar o primeiro número
                System.out.println("Informe o primeiro número");
                num1 = scanner.nextFloat();

                System.out.println("Informe o segundo número");
                num2 = scanner.nextInt();


                //descrição das operações das quatro opções, 
                if(opcao == 1){
                    result = num1 + num2;
                }else if(opcao == 2) {
                    result = num1 - num2;
                }else if(opcao == 3) {
                    result = num1 * num2;
                } else {
                    result = num1 / num2;
                }
                //comando para exibir na tela o resultado
                System.out.println("Resultado:" + result);
                System.out.println("Deseja realizar mais alguma operação?(Sim=1/ Não=0)");
                opcao = scanner.nextInt(); //control+espaço para usar o completar do netbeans
                
                if (opcao ==0) {
                    
                }
                
                System.out.println("============================================");
                
           
    } 
   }
}


