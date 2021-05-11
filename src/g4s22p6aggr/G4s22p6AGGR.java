/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s22p6aggr;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author arman
 */
public class G4s22p6AGGR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<String>(Arrays.asList("A", "B", "C", "D","E"));
        lista.forEach(contenido -> {
            System.out.println("El valor del contenido es" + contenido);
        });
        
        lista.add("H");
        lista.add("I");
        
        System.out.println("\n segunda forma de trabajar recorridos de listas \n");
        
        for(String contenido1 : lista){
            System.out.println("El valor del contenido es" + contenido1 );
        }
        
        lista.add("Armando");
        lista.add("Esta es una linea muy larga");
        lista.add("Gustavo");
        lista.add("Segunda line muy larga sin problemas de almacenamiento");
        
         System.out.println("\n tercer forma de trabajar recorridos en listas");
         
         lista.stream() .forEach(contenido2 -> {;
             System.out.println("El valor contenido es " + contenido2);
         });
                
    }
    
}
