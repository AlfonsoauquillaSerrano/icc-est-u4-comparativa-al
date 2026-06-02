import java.util.concurrent.Callable;

import Utils.BenchMarking;
import controles.SortPersonaMethods;
import models.Persona;
import models.Resultado;
public class App {
    
    public static void main(String[] args) throws Exception {
        
       int cantidad = 10_000;
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

        System.out.println();

        int cantidadEscenario2 = cantidad + 1;
        metodos.quickSort(base, 0, base.length - 1);
        Persona[] baseCasiOrdenada = new Persona[cantidadEscenario2];

        for (int i = 0; i < base.length; i++) {
            baseCasiOrdenada[i] = base[i];
        }
        baseCasiOrdenada[baseCasiOrdenada.length - 1] = new Persona("Persona nueva", (int)(Math.random() * 101));
        Persona[] copiaInsercion2= baseCasiOrdenada.clone();
        Persona[] copiaQuickSort2= baseCasiOrdenada.clone();

        SortPersonaMethods metodos2 = new SortPersonaMethods();
        Callable<Void> funcionInsercion2 = () ->{
            metodos2.insertionSort(copiaInsercion2);            
            return null;

        };
        

        Resultado rInsercion2 = BenchMarking.medirTiempo(funcionInsercion2, "Insercion", "Casi ordenada + 1 persona", cantidad);
        System.out.println(rInsercion2);

        Callable<Void> funcionQuickSort2 = () ->{
            metodos.quickSort(copiaQuickSort2, 0,copiaQuickSort2.length-1 );             
            return null;

        };
        Resultado rQuickSort2  = BenchMarking.medirTiempo(funcionQuickSort2, "QuickSort", "Casi ordenada + 1 persona", cantidad);
        System.out.println(rQuickSort2);
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

