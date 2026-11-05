/**
 * Clase que contiene el algoritmo Bubble Sort.
 * Ordena un arreglo de números de menor a mayor.
 *
 * @author Uriel Ramírez
 * @date 05 noviembre 2026
 */
package src;
public class BubbleSort {

    /**
     * Ordena un arreglo utilizando Bubble Sort.
     * También las comparaciones, intercambios y pasadas.
     */
    public static void bubbleSort(int[] arreglo) {

        // Cuenta las comparaciones.
        int comparaciones = 0;

        // Cuenta los intercambios que se hicieron.
        int intercambios = 0;

        // Cuenta las pasadas realizadas.
        int pasadas = 0;

        // Controla las pasadas del algoritmo.
        for (int i = 0; i < arreglo.length - 1; i++) {

            // Indica si se hizo algún intercambio.
            boolean cambio = false;

            // Compara los elementos consecutivos del arreglo.
            // Se reducen las comparaciones en cada pasada.
            for (int j = 0; j < arreglo.length - 1 - i; j++) {

                // Aumenta el contador de comparaciones.
                comparaciones++;

                // Comprueba si los elementos están desordenados.
                if (arreglo[j] > arreglo[j + 1]) {

                    // Guarda temporalmente el primer elemento.
                    int temporal = arreglo[j];

                    // Intercambia los elementos.
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;

                    // Aumenta el contador de intercambios.
                    intercambios++;

                    // Indica que hubo un intercambio.
                    cambio = true;
                }
            }

            // Aumenta el contador de pasadas.
            pasadas++;

            // Muestra el arreglo después de cada pasada.
            System.out.print("Pasada " + pasadas + ": ");

            for (int k = 0; k < arreglo.length; k++) {
                System.out.print(arreglo[k] + " ");
            }

            System.out.println();

            // Si no hubo intercambios, el arreglo ya está ordenado.
            if (cambio == false) {
                break;
            }
        }

        // Muestra las estadísticas del ordenamiento.
        System.out.println("Total de comparaciones: " + comparaciones);
        System.out.println("Total de intercambios: " + intercambios);
        System.out.println("Total de pasadas: " + pasadas);
    }
}