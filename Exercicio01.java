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
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escreva um numero");
        
        int numero = entrada.nextInt();
        System.out.println("");
        int tabuada = 0; 
        for(int i = 1; i<=10; i++){
           
           tabuada = numero * i;
        
           System.out.println(i + " x " + numero + " = " + tabuada);
        }
        
    }
    
}
