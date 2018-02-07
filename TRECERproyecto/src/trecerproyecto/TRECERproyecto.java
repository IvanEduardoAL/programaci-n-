/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trecerproyecto;

/**
 *
 * @author aivan
 */import java.util.Scanner;
public class TRECERproyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        Scanner tem = new Scanner(System.in);
        int edad, x;
        x = 1;
        while (x == 1) {
            System.out.println("Ingrese edad");
            edad = tem.nextInt();
            if (edad <=5){
                System.out.println(" PICHON");
            }
            else if(edad >=6 && edad <=15){
               System.out.println(" Puberto"); 
               
            }
              else if(edad >=16 && edad <=20){
               System.out.println(" Adulto"); 
               
            } 
            else if(edad >=21 && edad <=25){
               System.out.println(" Cool"); 
               
            }
            else if(edad >=26 && edad <=40){
               System.out.println(" Chavorrucos"); 
               
            }
            else if(edad >=41 && edad <=60){
               System.out.println(" Señor"); 
               
            }
            else if(edad >=61 ){
               System.out.println(" Viejo"); 
               
            }
            }
        
    }
    
}
