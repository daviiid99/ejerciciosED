import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

// Clase para generar, rellenar, sumar y hacer medias de una Array
public class repasoArrays {
    
    
    public static ArrayList<Integer> rellenarLista(){
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>(100);

        
        for (int i = 0; i<listaNumeros.size() | i < 100 +1; i++){
            listaNumeros.add(i);
            
        }
        
        return listaNumeros;
}    
 
    public static int sumarLista(ArrayList<Integer> listaN){
        int suma = 0;
        
        for (int i = 0; i <= listaN.get(listaN.size()-1); i++) {
            suma+=listaN.get(i);
        }
        return suma;
    } 
    
    public static double mediaLista(int suma, ArrayList<Integer> lista){

            return ((double)(suma/lista.size()));
    }
    
    public static void main (String[] args){
        repasoArrays listaNumeros = new repasoArrays();
        ArrayList<Integer> rellenar;
        int sumar;
        double media;
        
        rellenar = listaNumeros.rellenarLista();
        sumar = listaNumeros.sumarLista(rellenar);
        media = listaNumeros.mediaLista(sumar, rellenar);
        
        System.out.println(rellenar);
        System.out.println(sumar);
        System.out.println(media);
   
    }

}
