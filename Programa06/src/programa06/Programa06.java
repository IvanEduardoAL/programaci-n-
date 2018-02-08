/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa06;

/**
 *
 * @author aivan
 */import java .util.Scanner;
public class Programa06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
         System.out.println("Las horas se ingresan en formato 24 horas");
         System.out.println("ingresa  la hora  entrada");
         int hora= teclado. nextInt();
         System.out.println("ingresa los  minutos entrada");
         int min= teclado.nextInt();
         System.out.println("ingresa los  segundos entada");
         int seg= teclado.nextInt();
         System.out.println("hora de entada:"+" "+hora+":"+min+":"+seg);
         System.out.println("ingresa  la hora  salida");
         int horas= teclado. nextInt();
         System.out.println("ingresa los  minutos salida");
         int mins= teclado.nextInt();
         System.out.println("ingresa los  segundos salida");
         int segs= teclado.nextInt();
         System.out.println("hora de salida:"+" "+horas+":"+mins+":"+segs);
         
         int horatotal= Math.abs(horas-hora) ;
         int mintotal=Math.abs( mins-min);
         int segtotal= Math.abs(segs-seg);
          System.out.println("Tiempo total:"+horatotal+":"+mintotal+":"+segtotal);
          
    }
    
}
