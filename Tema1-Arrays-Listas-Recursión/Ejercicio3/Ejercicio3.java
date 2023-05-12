package Ejercicio3;
/*Implemente una Pila utilizando la Lista del ejercicio 1. 
-A una pila se le pueden agregar elementos utilizando el método push(T o). 
-Para retirar elementos de la colección se utiliza el método pop(), que retorna
el último elemento agregado a la colección y lo elimina de la misma. 
-Es posible consultar el tope de la pila (sin eliminarlo) utilizando el método top().
- Por último, es posible invertir el orden de los elementos de la pila mediante el método reverse().
*/
public class Ejercicio3 {
	public static void main(String [] args) {
		Pila<Integer> pila = new Pila<Integer>();
		pila.push(5);
		pila.push(4);
		pila.push(3);
		pila.push(2);
		pila.push(1);

		
		//System.out.println(pila.getSize());
		System.out.println(pila);
		pila.reverse();
		System.out.println(pila.top());
		//System.out.println(pila.getSize());
	}

}
