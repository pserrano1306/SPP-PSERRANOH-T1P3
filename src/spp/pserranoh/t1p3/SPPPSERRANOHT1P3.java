/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.pserranoh.t1p3;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class SPPPSERRANOHT1P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Pablo Serrano Hernández A01410753 (IMT)
        System.out.println("Calculadora de distancia entre dos puntos");
        //variables
        Scanner teclado =new Scanner (System.in);
       
        double x1,x2,y1,y2,d;
        
        //Ejecucion
        System.out.println("Ingrese una coordenada de la primera localizacion");
        x1 = teclado.nextDouble();
       System.out.println("Ingrese la segunda coordenada de la primera localizacion");
        y1 = teclado.nextDouble();
        System.out.println("Ingrese una coordenada de la segunda localizacion");
        x2 = teclado.nextDouble();
        System.out.println("Ingrese una coordenada de la segunda localizacion");
        y2 = teclado.nextDouble();
        
      
        
        
        // Calculos
       d = Math.sqrt (((Math.pow(x1-x2,2)) + ((Math.pow(y1-y2,2)))));
        
       
        
        
      //Resultados
        System.out.println ("La distancia entre los dos puntos es de "+d);
        
    }
    
}
