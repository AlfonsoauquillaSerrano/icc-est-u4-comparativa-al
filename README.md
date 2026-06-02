# Analisis de Metodos
Nombre: Alfonso Auquilla
## Resultados Obtenidos
### Tabla caso 1: arreglo desordenado

| Tamano de muesta | Tiempo Insercion | Tiempo QuickSort |Algoritmo mas rapido |Observacion |
| ------------ | ------------ | ------------ |------------ | ------------|
| 10.000| 666.255 ms| 7.509 ms|QuickSort|QuickSort es casi 88 veces mas rapido en datos desordenados y grandes QuickSort es muy eficiente|
| 50.000| 19512.86 ms| 48.07 ms|QuickSort|QuickSort es casi 406 veces mas rapido|
| 100.000| 85020.45 ms| 109.3639 ms|QuickSort|QuickSort es casi 777 veces mas rapido Demostrando que mientras mas datos QuickSort va a ser aun mucho mas eficiente sacandole cada vez mas ventaja a Insercion|

### Tabla caso 2: arreglo ordenado mas una nueva persona

| Tamano de muesta | Tiempo Insercion | Tiempo QuickSort |Algoritmo mas rapido |Observacion |
| ------------ | ------------ | ------------ |------------ | ------------|
| 10.000| 0.479 ms| 786.19 ms|Insercion|Se observa que en datos ordenados mas una persona Insercion es muchisimo mas eficiente que Quick sort incluso supero los tiempos del caso anterior|
| 50.000| 4.42 ms| 36.62 ms|Insercion|Se ve que aunque los tiempos de QuickSort varian siempre van a ser menos que Insercion en este caso|
| 100.000| 11.52 ms| 96.35 ms|Insercion|En datos muy grandes los tiempos de QuickSort van aumentando |

### Analisis General

En el caso donde el arreglo estaba desordenado, QuickSort fue mucho más rápido que Inserción Donde el arreglo fue ordenado, la inserción fue la más rápida, superando a QuickSort. El crecimiento del tamaño de muestra no afectó exactamente por igual a ambos, como se puede ver en la tabla del caso 1 y caso 2. Notarán que Inserción fue extremadamente afectada por el tamaño de muestra, ya que, como sabemos, en el peor caso, Inserción se comporta con O(n al cuadrado), así que si los datos aumentan un poco, el resultado cambiará drásticamente al elevarse al cuadrado. En cambio, como QuickSort se comporta como O(n log n), la diferencia no es tan drástica como en Inserción Inserción funciona mejor en arreglos ya ordenados o casi ordenados porque Inserción compara el elemento con el elemento interior y, según eso, realiza un bucle, pero como el arreglo ya está ordenado, casi nunca usa ese bucle, haciendo que solo realice una lectura rápida del arreglo, haciendo su complejidad O(n). QuickSort es mejor en datos ordenados porque, como divide el arreglo, va haciendo subgrupos pequeños según el pivote muy rápido, y lo termina de ordenar.

### Conclusión 1

En el caso 1, donde el arreglo está desordenado, se demostró que QuickSort fue extremadamente más eficiente, como se vio en la tabla 1, al incrementar el tamaño de la muestra.

### Conclusión 2

En el caso 2, donde el arreglo está casi ordenado, se invirtió el algoritmo más rápido, o sea que Inserción fue más rápido; esto demuestra que en arreglos casi ordenados, Inserción es el más rápido.

### Conclusión 3

El incremento de la muestra afectó de diferentes maneras a los 2 algoritmos. En Inserción, el incremento de los datos hizo que cada vez sea más lento, haciendo una gran diferencia entre los diferentes tamaños, pero a QuickSort no le afectó tanto, manteniendo una velocidad cercana, observando que el aumento de datos no lo afectó exponencialmente como a Inserción.



