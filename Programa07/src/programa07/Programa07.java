/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa07;

/**
 *
 * @author aivan
 */import java .util.Scanner;
public class Programa07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa los dias que trabajo");
        int diaz= teclado.nextInt();
        int arrhora []=new int[diaz];
        int arrmin []= new int [diaz];
        int arrseg []=new int [diaz];
        
        for(int i=0;i<diaz;i++){
            int ind=i+1;
            System.out.println("Dias:"+ind);
            System.out.println("Ingresa la hora");
            int hora=teclado.nextInt();
           arrhora[i]=hora;
            System.out.println("Ingresa la minuto");
            int min=teclado.nextInt();
            arrmin[i]=min;
            System.out.println("Ingresa la segundo");
            int seg=teclado.nextInt();
            arrseg[i]=seg;
            
           }   
        for (int i= 0 ; i < arrhora.length ; i ++) {
            System.out.println("Elemento en indice " + i + ": " + arrhora[i]);
           // int horaT= arrhora[i]+arrhora[i+1];
           // System.out.println("horas:"+horaT);
           int horaT= arrhora[i]+arrhora[i+1];
           System.out.println(horaT);
        }
        
         for (int i= 0 ; i < arrmin.length ; i ++) {
            System.out.println("Elemento en indice " + i + ": " + arrmin[i]);
            int minT= arrmin[i]+arrmin[i+1];
            System.out.println(minT);
            } 
          for (int i= 0 ; i < arrseg.length ; i ++) {
            System.out.println("Elemento en indice " + i + ": " + arrseg[i]);
            int segT= arrseg[i]+arrseg[i+1];
            System.out.println(segT);
          }
          
           
          
         
    }
        
    
    
    
}
