/*Ejercicio 3:
Implemente un algoritmo recursivo que convierta un número en notación decimal a su equivalente en notación binaria*/
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println(convertirABinario(28));
    }
    private static String convertirABinario(int numero) {
        if (numero < 2) {
            return Integer.valueOf(numero).toString();
        } else {
            return convertirABinario(numero / 2) + numero % 2;
        }
    }

}


