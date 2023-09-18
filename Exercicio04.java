/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Exercicio04 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        

       
        int soma = 0;
        double media = 0;
        for( int i = 1; i<= 5; i++){
          System.out.println("infome um numero");
        int numero = entrada.nextInt();
          
           soma += numero;
           media = soma /5;
        }
        System.out.println("a soma é:" + soma);
        System.out.println("a media é: " + media);
        
        
    }
    
    
    
}
