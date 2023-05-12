package Ejercicio4;

/*A la implementación de la clase Lista realizada en el ejercicio 1, 
agregue un método indexOf, que reciba un elemento y retorne el índice 
donde está almacenado ese elemento, o -1 si el elemento no existe en la lista.*/
public class Ejercicio4 {
	public static void main(String[] args) {
		Pila<Integer> pila = new Pila<Integer>();
		pila.push(5);//0
		pila.push(4);//1
		pila.push(3);//2
		pila.push(2);//3
		pila.push(1);//4
		System.out.println(pila);
		System.out.println(pila.indexOf(12));
		System.out.println(pila);
	}

}
