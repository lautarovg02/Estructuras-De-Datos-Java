package Ejercicio2;
/* * Ejercicio 2 : Dado un árbol binario de búsquedas que almacena números enteros, implementar un algoritmo
* que retorne la suma de todos los nodos internos del árbol. */

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

        // * IMPRIMIENDO ARBOLES
        arbol.printPreorder();
        System.out.println();
        arbol.printInorder();
        System.out.println();
        arbol.printPostorder();
        System.out.println();
        System.out.println("Las hojas del arbol son: " + arbol.getLeaves());
        System.out.println("El total de la suma de todos los elementos del arbol es: " + arbol.getSumOfAllElements());
        System.out.println("El total de la suma de todos los elementos del arbol es: " + arbol.getSumOfAllInternalElements());

////        System.out.println("El arbol esta vacio: " + arbol.isEmpty());
//        System.out.println("Existe el elemento " + 34 + "  en el arbol: " + arbol.hasElem(34));
//        System.out.println("La altura del arbol es: " + arbol.getHeight());
//        System.out.println("El elemento de mayor valor en el Arbol es: " + arbol.getMaxElem());
//        System.out.println("El elemento de menor valor en el Arbol es: " + arbol.getMinElem());
//        System.out.println("Rama de mayor tamano en el Arbol es: " + arbol.getLongestBranch());
//        System.out.println("Las hojas del arbol son: " + arbol.getLeaves());
//        System.out.println("Los elementos del nivel " + 1 + " son: " + arbol.getElemAtLevel(1));
//
//
//        System.out.println("Pude borrar el elemento  " + 13 + " son: " + arbol.delete(13));
//        System.out.println("Existe el elemento " + 13 + "  en el arbol: " + arbol.hasElem(13));
//        arbol.printPreorder();
//        System.out.println();
//
//        System.out.println("Pude borrar el elemento  " + 22 + " son: " + arbol.delete(22));
//        System.out.println("Existe el elemento " + 22 + "  en el arbol: " + arbol.hasElem(22));
//        arbol.printPreorder();
//        System.out.println();
//
//        System.out.println("Pude borrar el elemento  " + 4 + " son: " + arbol.delete(4));
//        System.out.println("Existe el elemento " + 4 + "  en el arbol: " + arbol.hasElem(4));
//        arbol.printPreorder();
//        System.out.println();
//
//        System.out.println("Pude borrar el elemento  " + 2 + " son: " + arbol.delete(2));
//        System.out.println("Existe el elemento " + 2 + "  en el arbol: " + arbol.hasElem(2));
//        arbol.printPreorder();
//        System.out.println();
//
//        System.out.println("//////////////////////////////////////////////////////////////////////////////");
//
//        System.out.println("Existe el elemento " + 34 + "  en el arbol: " + arbol.hasElem(34));
//        System.out.println("La altura del arbol es: " + arbol.getHeight());
//        System.out.println("El elemento de mayor valor en el Arbol es: " + arbol.getMaxElem());
//        System.out.println("El elemento de menor valor en el Arbol es: " + arbol.getMinElem());
//        System.out.println("Rama de mayor tamano en el Arbol es: " + arbol.getLongestBranch());
//        System.out.println("Las hojas del arbol son: " + arbol.getLeaves());
//        System.out.println("Los elementos del nivel " + 1 + " son: " + arbol.getElemAtLevel(1));
    }
}
