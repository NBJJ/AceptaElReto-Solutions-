/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreton;

import java.util.Scanner;

/**
 *
 * @author Nicolás
 */

public class LaTiendadelaEsquina {
       
public static void main(String[] args) {

          int  a, b, resto,  e2 = 0 ,e1 =0 , c50 = 0 ,c20 =0 , c10 = 0 ,c5 = 0, c2 = 0,c1 = 0;
            int Casos;
           Scanner teclado = new Scanner(System.in);
 
           Casos = teclado.nextInt();



           for(int i =0; i<Casos ; i++) {
                        a= teclado.nextInt();
                       b= teclado.nextInt();
             if(a > b){
                  System.out.println("DEBE " + (a - b) );
             }else {
              
              resto = (b-a);
            while(resto > 0) {
                
                if( resto>=200) {
                    e2 = resto / 200; 
                    resto = resto % 200;
                }
                if(resto>=100) {
                    e1 = resto / 100; 
                    resto = resto % 100;
                }
                if(resto >= 50) {
                    c50 = resto / 50; 
                    resto = resto % 50;
                }
                if(resto >= 20) {
                    c20 = resto / 20; 
                    resto = resto % 20;
                }
                if(resto >= 10) {
                    c10 = resto / 10; 
                    resto = resto % 10;
                }
                if(resto >= 5) {
                    c5 = resto / 5;
                    resto = resto % 5;
                }
                if(resto >= 2) {
                    c2 = resto / 2; 
                    resto = resto % 2;
                }
                if(resto >=1) {
                    c1 = resto / 1;
                    resto = resto % 1;
                }
            }
             System.out.println( e2 + " " +  e1 + " " + c50 + " " + c20 + " " +  c10 + " " + c5 + " " + c2 + " " + c1);
      }
    }
  }
}



