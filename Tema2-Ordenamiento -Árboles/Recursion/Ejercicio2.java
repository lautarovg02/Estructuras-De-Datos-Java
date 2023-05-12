/*Ejercicio 2.
Implemente un algoritmo recursivo para buscar un elemento en un arreglo ordenado
ascendentemente.*/
public class Ejercicio2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 5;
        System.out.println("Existe el numero: " + num + " " + encontrarElemOrdenadoAsc(num, arr, 0, arr.length));
    }

    public static boolean encontrarElemOrdenadoAsc(int elem, int arr[], int inicio, int fin) {
        boolean existe = false;
        if (inicio <= fin && arr[inicio] <= elem) {
            if (arr[inicio] == elem) {
                return true;
            } else {
                inicio++;
                existe = encontrarElemOrdenadoAsc(elem, arr, inicio, fin);
            }
        } else {
            return false;
        }

        return existe;
    }
}
