/*Implemente un algoritmo de ordenamiento mergesort para un arreglo de tamaño N.
Implemente un algoritmo de ordenamiento quicksort para un arreglo de tamaño N.
1. ¿Cuál es su complejidad en el peor caso?
2. ¿Cuál es su complejidad promedio? o(n.log2 n) */
public class Ejercicio7 {
    final static int MAX = 9;

    public static void main(String[] args) {
        int [] numeros = {1,4,6,22,53,12,43,278,31};
        mostrarArreglo(numeros);
        MergeSort mergeSort = new MergeSort();
       // mergeSort.sort(numeros);
        quicksort(numeros,0,numeros.length);
        mostrarArreglo(numeros);
    }

    public static void mostrarArreglo(int[] arr) {
        for(int i = 0; i < MAX; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println("///////////");
    }

    public static void quicksort(int A[], int izq, int der) {

        int pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i < j){                          // mientras no se crucen las búsquedas
            while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
            while(A[j] > pivote) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado
                aux= A[i];                      // los intercambia
                A[i]=A[j];
                A[j]=aux;
            }
        }

        A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos
        A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha

        if(izq < j-1)
            quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
        if(j+1 < der)
            quicksort(A,j+1,der);          // ordenamos subarray derecho

    }
}
