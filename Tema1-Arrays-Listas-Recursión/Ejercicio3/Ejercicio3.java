package Ejercicio3;
/*Implemente una Pila utilizando la Lista del ejercicio 1. 
-A una pila se le pueden agregar elementos utilizando el m�todo push(T o). 
-Para retirar elementos de la colecci�n se utiliza el m�todo pop(), que retorna
el �ltimo elemento agregado a la colecci�n y lo elimina de la misma. 
-Es posible consultar el tope de la pila (sin eliminarlo) utilizando el m�todo top().
- Por �ltimo, es posible invertir el orden de los elementos de la pila mediante el m�todo reverse().
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
