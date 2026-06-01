import java.util.concurrent.Callable;

import Utils.BenchMarking;
import controles.SortPersonaMethods;
import models.Persona;
public class App {
    
    public static void main(String[] args) throws Exception {}
        
        public static Persona[] generarPersonas (int cantidad){
            Persona[] personas = new Persona[cantidad];
            for (int i = 0; i < cantidad; i++) {
             String nombre= "Persona "+(i+1);
             int edad= (int)(Math.random() * 101);
             personas[i]=new Persona(nombre,edad);
            }
            return personas;
        }

       Persona[] base = generarPersonas(10000);
       Persona[] copiaInsercion= base.clone();
       Persona[] copiaQuickSort= base.clone();

       SortPersonaMethods metodos = new SortPersonaMethods();
        Callable<Void> funcionBubble = () ->{
            metodos.insertionSort(copiaInsercion);            
            return null;

        };
        Results rBubble = BenchMarking.medirTiempo(funcionBubble,"Burbuja: ",size);
        System.out.println(rBubble.getName()+" = "+rBubble.getTime());

        Callable<Void> funcionBubbleAvan = () ->{
            metodos.sortBubbleAvan(arreglo3);             
            return null;

        };
        Results rBubbleAvan = BenchMarking.medirTiempo(funcionBubbleAvan,"Burbuja avanzado: ",size);
        System.out.println(rBubbleAvan.getName()+" = "+rBubbleAvan.getTime());

        Callable<Void> funcionShell = () ->{
            metodos.sortShell(arreglo3);             
            return null;

        };
        Results rShell= BenchMarking.medirTiempo(funcionShell,"SHELL: ",size);
        System.out.println(rShell.getName()+" = "+rShell.getTime());
    }

    public static int[] generate(int size){
        int [] array = new int [size];
        for(int i = 0; i < size;i ++){
            int numero =(int)(Math.random()*10000);
            array[i]=numero;
        }
        return array;
    
}
