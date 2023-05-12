/*Ejercicio 4.
Implemente un algoritmo recursivo que presente los primeros N términos de la secuencia de
Fibonacci.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        int numero = 1;
        int anterior = 0;
        int secuencia = 10;
        mostrarSerieFibonacci(secuencia, anterior, numero);
    }

    // 1 1 2 3 5
    public static void mostrarSerieFibonacci(int secuencia, int anterior, int numero) {
        int temp = numero;
        if (secuencia > 1) {
            if (anterior == 0) {
                System.out.println(numero);
            }
            numero = numero + anterior;
            System.out.println(numero);
            anterior = temp;
            mostrarSerieFibonacci(secuencia - 1, anterior, numero);
        }

    }
}
