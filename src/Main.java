/**
 * Clase principal del programa Bubble Sort.
 * Contiene los arreglos de prueba y ejecuta el algoritmo.
 *
 * @author Uriel Ramírez
 * @date 05 noviembre 2026
 */
package src;
public class Main {

       public static void main(String[] args) {

        // Arreglo con números desordenados.
        int[] arreglo1 = {34, 12, 25, 8, 19};

        // Arreglo que ya está ordenado.
        int[] arreglo2 = {1, 2, 3, 4, 5};

        // Arreglo con los números en orden inverso.
        int[] arreglo3 = {5, 4, 3, 2, 1};

        // Ejecuta BubbleSort con el primer arreglo.
        System.out.println("ARREGLO 1:");
        BubbleSort.bubbleSort(arreglo1);

        // Ejecuta BubbleSort con el segundo arreglo.
        System.out.println("\nARREGLO 2:");
        BubbleSort.bubbleSort(arreglo2);

        // Ejecuta BubbleSort con el tercer arreglo.
        System.out.println("\nARREGLO 3:");
        BubbleSort.bubbleSort(arreglo3);
    }
}