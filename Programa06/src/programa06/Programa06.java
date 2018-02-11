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
         System.out.println("Las horas se ingresan en formato 24 horas\nIngresa  la hora  entrada");
         //System.out.println("ingresa  la hora  entrada");
         int horae= teclado. nextInt();
         System.out.println("ingresa los  minutos entrada");
         int mine= teclado.nextInt();
         System.out.println("ingresa los  segundos entada");
         int sege= teclado.nextInt();
         System.out.println("hora de entada: "+horae+":"+mine+":"+sege);
         System.out.println("ingresa  la hora  salida");
         int horas= teclado. nextInt();
         System.out.println("ingresa los  minutos salida");
         int mins= teclado.nextInt();
         System.out.println("ingresa los  segundos salida");
         int segs= teclado.nextInt();
         System.out.println("hora de salida: "+horas+":"+mins+":"+segs);
         if (sege>segs){
         segs+=60;
         mins--;
         }
         if (mine>mins){
        mins+=60;
         horas--;
         }
         int segt=segs-sege;
         int mint=mins-mine;
         
         int horat= horas-horae;
         
         System.out.println("tiempo total:"+horat+":"+mint+":"+segt);
         
         //int horatotal= Math.abs(horas-hora) ;
         //int mintotal=Math.abs( mins-min);
         //int segtotal= Math.abs(segs-seg);
          //System.out.println("Tiempo total:"+horatotal+":"+mintotal+":"+segtotal);
          
    }
}   

