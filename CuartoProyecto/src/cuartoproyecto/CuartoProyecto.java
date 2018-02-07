/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuartoproyecto;

/**
 *
 * @author aivan
 */import java .util.Scanner;
public class CuartoProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tem = new Scanner(System.in);
        int num, x;
        x = 1;
        while (x == 1) {
            System.out.println("Ingrese un numero del 1 al 12 para que te diga que mes es:");
            num = tem.nextInt();
            if (num ==1){
            System.out.println(" Es  Enero  y tienen 31 dias");
            } 
             if (num ==2){
            System.out.println(" Es  Febrero y tienen 29 dias");
            } 
              if (num ==3){
            System.out.println(" Es  Marzo  y tienen 31 dias");
            } 
               if (num ==4){
            System.out.println(" Es  Abril  y tienen 30 dias");
            } 
                if (num ==5){
            System.out.println(" Es  Mayo  y tienen 31 dias");
            } 
                 if (num ==6){
            System.out.println(" Es  Junio y tienen 30 dias");
            } 
                  if (num ==7){
            System.out.println(" Es  Julio y tienen 31 dias");
            } 
                   if (num ==8){
            System.out.println(" Es  Agosto y tienen 31 dias");
            }
                    if (num ==9){
            System.out.println(" Es  Septiembre  y tienen 30 dias");
            } 
                     if (num ==10){
            System.out.println(" Es  Octubre  y tienen 31 dias");
            } 
                      if (num ==11){
            System.out.println(" Es  Noviembre y tienen 30 dias");
            } 
                       if (num ==12){
            System.out.println(" Es  Diciembre y tienen 31 dias");
            } 
            }
        }
    }
    

