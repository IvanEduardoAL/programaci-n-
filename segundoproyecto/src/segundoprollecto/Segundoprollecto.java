/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoprollecto;

/**
 *
 * @author aivan
 */
/import java.util.Scanner;



public class Segundoprollecto {

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
            if (edad >= 18) {
                System.out.println("eres mayor de edad");
            } else {
                System.out.println("no eres mayor de edad");
            }
        }
    }

}
