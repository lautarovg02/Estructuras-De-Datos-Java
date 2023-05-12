package Ejercicio5;


/*Ejercicio 5.
A partir de la clase Lista implementada en el ejercicio 1, implemente el patrón
iterator-iterable, para que la lista sea iterable. 
¿Existe alguna ventaja computacional a la hora de recorrer la lista de principio
 a fin si se cuenta con un iterador?
*/
public class Ejercicio5 {
	public static void main(String[]args) {
		MySimpleLinkedList<Integer> list = new MySimpleLinkedList<Integer>();
		list.insertFront(1);
		list.insertFront(2);
		list.insertFront(3);
		
		/*for(int i = 0; i < list.getSize(); i++) {// 0(n*n)
			System.out.println(list.get(i));// 0(n)
		}
		System.out.println();
		list.iniciarCursor();// 0(1)
		for(int i = 0; i < list.getSize(); i++) {//0(n)
			System.out.println(list.obtenerInfoCursor());//0(1)
			list.avanzarCursor();//0(1)
		}*/
		System.out.println();
		MyIterator<Integer> it =  (MyIterator<Integer>) list.iterator();//0(1)
		MyIterator<Integer> it2 =  (MyIterator<Integer>) list.iterator();//0(1)

		while(it.hasNext()) {//0(n)
			System.out.println(it.next());//0(1)
		}

	}
}
