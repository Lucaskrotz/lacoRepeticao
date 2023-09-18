/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author Lucas
 */
public class Exercicio05 {
    
    public static void main(String[] args) {
        
        boolean primo = true;
        
        for(int i = 6; i<=1000000; i+=2){
            for(int j = 3; j < Math.sqrt(i); j+=2){
                
                
                
                    
            if(i%j==0){
  
                
                primo = false;
                j=i;
                
                
            }
           
            }
            
            if(primo){
            
                System.out.println(i +";");
                
            }
            primo=true;
        }
        
        
        
    }
         
    
}
