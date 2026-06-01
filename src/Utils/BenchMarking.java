package Utils;
import models.Resultado;
import java.util.concurrent.Callable;
public class BenchMarking {
    public static Resultado medirTiempo(Callable<Void> funcion , String algoritmo, String escenario, int sample){
    try {
        long inicio = System.nanoTime();
        funcion.call();
        long fin = System.nanoTime();
        double duracion = fin - inicio;

        Resultado resultados = new Resultado(algoritmo,escenario, sample,duracion);
        return resultados;
        
    } catch (Exception e) {

        throw new RuntimeException("Error en la funcion");
        
    }

    

  }
}
