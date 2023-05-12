package Ejercicio3;


/* *Dado un árbol binario de búsqueda que almacena números enteros y un valor de entrada K,
 * implementar un algoritmo que permita obtener un listado con los valores de todas las hojas cuyo valor supere K.
 * Por ejemplo, para el árbol de la derecha, con un valor K = 8, el resultado debería ser [9, 11].*/
public class Main {

    public static void main(String[] args) {
        // * CREANDO ARBOLES

        Tree arbol = new Tree(12);

        arbol.add(2);
        arbol.add(4);
        arbol.add(16);
        arbol.add(15);
        arbol.add(1);
        arbol.add(18);
        arbol.add(13);
        arbol.add(22);
        arbol.add(14);
        arbol.add(8);
        arbol.add(3);
        arbol.add(11);
        arbol.add(17);
        arbol.add(23);

        System.out.println(arbol.getLeaves());
        System.out.println(arbol.getLeavesLongerThanX(15));
        System.out.println(arbol.getLongestBranch());



//        System.out.println(arbol.getLeavesLongerThanX());

    }
}
