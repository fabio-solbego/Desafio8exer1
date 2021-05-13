/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto10;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class Projeto10 {

   
    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);
        
        int chico,ze,anos;
        chico =150;
        ze = 110;
        anos = 0;
        
        while(chico >=ze){
            chico = chico + 2;
            ze = ze + 3;
            anos++;
        }
       
        System.out.println("Zé levou "+ anos +"anos para ser"
        +" maior que o chico");
        
         System.out.println(" Parabens xiru você está maior que o chico");
                
                
        
        
        
    }
    
}
