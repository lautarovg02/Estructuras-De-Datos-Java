//Dado un arreglo ordenado de números distintos A se desea construir un algoritmo que
//determine si alguno de los elementos de dicho arreglo contiene un valor igual a la posición en la
//cuál se encuentra, es decir, A[i] = i.
//1) Construir un algoritmo recursivo que responda a dicha verificación.
//2) Mostrar la pila de ejecución para la invocación algoritmo([-3, -1, 0, 2, 4, 6, 10])

public class Ejercicio5 {
    public static void main(String[] args) {
        //[-3, -1, 0, 2, 4, 6, 10]
        int A[] = {-3, -1, 0, 2, 4, 6, 10};
        System.out.println(verificarArreglo(A));
    }

    public static boolean verificarArreglo(int[] arr){
        boolean flag = false;
        int pos = 0;
        if(arr[pos] == pos){
            //Si el numero es igual retorno true
            flag = true;
        }else{
            //Si no es igual sigo buscando
            flag = verificarArreglo(arr,pos,arr.length);
        }
        return flag;
    }

    public static boolean verificarArreglo(int[] arr, int inicio, int fin) {
        boolean flag = false;
        int mitad;

        //LLEGO AL FIN DEL ARREGLO
        if(fin < inicio) return false;

        else {
            mitad = (inicio+fin/2);
            System.out.println(arr[mitad]);
             //Obtengo la mitad del arreglo
            if (arr[inicio] > arr[mitad]){
                //Si el numero es mayor al numero q esta ubicado en la mitad, avanzamos para la derecha
                flag = verificarArreglo(arr, mitad + 1, fin);
            }
            else if(arr[inicio] < arr[mitad]){
                //Si el numero es menor al numero q esta ubicado en la mitad, avanzamos para la izquierda
                flag = verificarArreglo(arr,inicio,mitad-1);
            }else flag = true;

        }
        return flag;
    }

}
