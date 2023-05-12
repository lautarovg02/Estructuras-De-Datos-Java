/*Ejercicio 6.
Implemente un algoritmo de ordenamiento por selección en un arreglo.
Implemente un algoritmo de ordenamiento por burbujeo en un arreglo.
1. ¿Qué complejidad O tienen estos algoritmos?*/
public class Ejercicio6 {
    public static final int MAX = 10;

    public static void main(String[] args) {
        int [] arr = {1,5,2,6,9,43,7,4,8,3,};
        mostrarArreglo(arr);
        ordenarPorSeleccion(arr);
        mostrarArreglo(arr);
    }

    public static void cargarArregloRandom(int [] arreglo) {
        int numRandom;
        for (int i=0; i < MAX; i++) {
            numRandom = (int) Math.floor(Math.random() * 100);
            arreglo[i] = numRandom;
        }

    }
    public static void mostrarArreglo(int[] arr) {
        for(int i = 0; i < MAX; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println("///////////");
    }

    public static void bubbleSortAdapt(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i=0; i<arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

    public static void ordenarPorSeleccion(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
    }
    public static void burbujeo(int[] arr){    //Creciente
        int temp;
        for(int i = 1;i < MAX;i++){
            for (int j = 0 ; j < MAX - 1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("///////////");
    }


}
