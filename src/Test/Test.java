
package Test;

import Genericos.ClaseGenerica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Test {
     public static void main(String [] args){
         
         //CLASE GENERICA
         ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
         objetoInt.obtenerTipo();
         
         ClaseGenerica<String> objetoString = new ClaseGenerica("Lizeth");
         objetoString.obtenerTipo();
         
         System.out.println("");
         System.out.println("");
         
         
        //COLLECTIONS 
        List miLista = new ArrayList();
        
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        //Recorrer lista
        for(Object elem : miLista){
            System.out.println("Elemento = "+elem);
        }
        //Funciones lambda        
        miLista.forEach(elem -> {
            System.out.println("Elemento = "+elem);
        });
         System.out.println("");
         System.out.println("");
         
         
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        
        imprimirx(miSet);
         System.out.println("");
         System.out.println("");
         
        Map miMap = new HashMap();
        miMap.put("valor1", "Angie");
        miMap.put("valor2", "Abner");
        miMap.put("valor3", "Axel");
        
        String elem = (String)miMap.get("valor1");
         System.out.println("Elemento = "+elem);
         
         imprimirx(miMap.keySet());
         imprimirx(miMap.values());
    }

    public static void imprimirx(Collection coleccion) {
        coleccion.forEach(elemen -> {
            System.out.println("Elemento = "+elemen);
        });
    }
     
}
