/*Implemente una función que cree un arreglo de tamaño N con números aleatorios. Corra los
algoritmos de los ejercicios 3 y 4, 10000 veces consecutivas cada uno, y compruebe el tiempo
de ejecución. Haga lo mismo con el método Arrays.sort(...) de Java, y compare los tiempos
obtenidos. Investigue cómo está implementado el Array.sort()*/
public class Ejercicio8 {
    public static void main(String[] args) {

    }

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
    private static String convertirABinario(int numero) {
        if (numero < 2) {
            return Integer.valueOf(numero).toString();
        } else {
            return convertirABinario(numero / 2) + numero % 2;
        }
    }


    public static int[] createArrayRandom(){
        int size = generateNumberRandom();
        int [] arrRandom = new int [size];
        for(int i = 0; i < arrRandom.length; i++){
            arrRandom[i] =  generateNumberRandom();
        }
        return arrRandom;
    }

    public static int generateNumberRandom(){
        return  (int) Math.floor(Math.random() * 100);
    }
}
