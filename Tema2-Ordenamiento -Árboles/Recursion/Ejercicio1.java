/*Implemente un algoritmo recursivo que determine si un arreglo de tamaño N está ordenado.
1. ¿Qué complejidad O tiene? (La complejidad en el peor caso)
2. ¿Trae algún problema hacerlo recursivo? ¿Cuál?
3. ¿Qué cambiaría si la estructura fuera una lista en lugar de un arreglo?*/
public class Ejercicio1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 5, 9, 10};
        imprimirArreglo(arr);
        System.out.println(estaOrdenado(arr, 0, arr.length - 1));
        imprimirArreglo(arr2);
        System.out.println(estaOrdenado(arr2, 0, arr.length - 1));
    }

    public static boolean estaOrdenado(int arr[], int inicio, int fin) {
        boolean estaOrdenado = true;
        if (inicio < fin) {
            if (arr[inicio] < arr[inicio + 1]) {//
                inicio++;
                estaOrdenado = estaOrdenado(arr, inicio, fin);
            } else {
                return false;
            }
        }
        return estaOrdenado;
    }

    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("]");

    }

}