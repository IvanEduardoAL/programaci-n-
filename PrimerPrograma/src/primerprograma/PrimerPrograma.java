/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprograma;

/**
 *
 * @author aivan
 */import java .util.Scanner;
public class PrimerPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tem = new Scanner(System.in);
        String nomb;
        String apell;
        System.out.println("Ingrese nombre");
        nomb = tem.nextLine();
        System.out.println("ingrese edad");
        apell = tem.nextLine();
        System.out.print("Hola Amigo:" +nomb +" " + apell);
        
        
        
        
    }
    
}
