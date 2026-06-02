import java.util.concurrent.Callable;

import Utils.BenchMarking;
import controles.SortPersonaMethods;
import models.Persona;
import models.Resultado;
public class App {
    
    public static void main(String[] args) throws Exception {
        
       int cantidad = 10000;
       String escenario = "Desordenado";

       Persona[] base = generarPersonas(cantidad);
       Persona[] copiaInsercion= base.clone();
       Persona[] copiaQuickSort= base.clone();

       SortPersonaMethods metodos = new SortPersonaMethods();
        Callable<Void> funcionInsercion = () ->{
            metodos.insertionSort(copiaInsercion);            
            return null;

        };
        

        Resultado rInsercion = BenchMarking.medirTiempo(funcionInsercion, "Insercion", escenario, cantidad);
        System.out.println(rInsercion);

        Callable<Void> funcionQuickSort = () ->{
            metodos.quickSort(copiaQuickSort, 0,copiaQuickSort.length-1 );             
            return null;

        };
        Resultado rQuickSort  = BenchMarking.medirTiempo(funcionQuickSort, "QuickSort", escenario, cantidad);
        System.out.println(rQuickSort);
        }
        public static int[] generate(int size){
        int [] array = new int [size];
        for(int i = 0; i < size;i ++){
            int numero =(int)(Math.random()*10000);
            array[i]=numero;
        }
        return array;
    } 

     public static Persona[] generarPersonas (int cantidad){
            Persona[] personas = new Persona[cantidad];
            for (int i = 0; i < cantidad; i++) {
             String nombre= "Persona "+(i+1);
             int edad= (int)(Math.random() * 101);
             personas[i]=new Persona(nombre,edad);
            }
            return personas;
        }
}

