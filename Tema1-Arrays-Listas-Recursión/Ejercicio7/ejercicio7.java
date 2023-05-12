package Ejercicio7;

/*Escriba una función que dadas dos listas construya otra con los elementos que están en la
primera pero no en la segunda.
*/
public class ejercicio7 {
	public static void main(String[] args) {
		///////////////////// CREANDO LISTAS /////////////////////
		MySimpleLinkedList<Integer> list1 = new MySimpleLinkedList<Integer>();
		MySimpleLinkedList<Integer> list2 = new MySimpleLinkedList<Integer>();

	//// list1 =  2 3 5 6 7 8 9
			//// list2 =  3 4 5 8 12 
			
		
		///////////////////// LLENANDO LISTA1 /////////////////////
		list1.insertInOrder(1);
		list1.insertInOrder(2);
		list1.insertInOrder(4);
		list1.insertInOrder(5);
		list1.insertInOrder(9);
		list1.insertInOrder(11);
		list1.insertInOrder(15);
		list1.insertInOrder(19);
		list1.insertInOrder(21);
		list1.insertInOrder(25);

		///////////////////// LLENANDO LISTA2 /////////////////////
		list2.insertInOrder(2);
		list2.insertInOrder(3);
		list2.insertInOrder(4);
		list2.insertInOrder(6);
		list2.insertInOrder(9);
		list2.insertInOrder(12);
		list2.insertInOrder(14);
		//list2.insertInOrder(321);

		///////////////////// MOSTRAMOS EL CONTENIDO DE LAS LISTAS /////////////////////
		System.out.println(list1);
		System.out.println();
		System.out.println(list2);

		///////////////////// ITERADOR LISTAS /////////////////////
		MyIterator<Integer> it1 = (MyIterator<Integer>) list1.iterator();
		MyIterator<Integer> it2 = (MyIterator<Integer>) list2.iterator();

		///////////////////// CREAMOS LISTA PARA GUARDAR /////////////////////
		MySimpleLinkedList<Integer> list3 = new MySimpleLinkedList<Integer>();

		while (it1.hasNext() && it2.hasNext()) {
			// Si el valor de iter2 es menor al de iter1, avanzo el iter2
			if ((int) it2.getInfo() < (int) it1.getInfo()) {
				//Mientras no sea el ultimo avanza
				if(it2.esElUltimo()) {
					it2.avanzar();
				}else {
					//Si es el ultimo y it1 es mayor lo agregamos y seguimos 
					// recorriendo it1 por si es mas grande q la lista 2
					list3.insertInOrder(it1.getInfo());
					it1.avanzar();
				}
			}
			// Si el valor de iter1 es menor al de iter2, avanzo el iter2
			else if ((int) it1.getInfo() < (int) it2.getInfo()) {
				 list3.insertInOrder(it1.getInfo());
				 //System.out.println(list3);
				 it1.avanzar();
			}
			else if(list1.esIgual(it1.getInfo(), it2.getInfo())){
				it1.avanzar();
				//Mientras no sea el ultimo avanza
				if(it2.esElUltimo()) {
					it2.avanzar();
				}else {
					//Si es el ultimo y it1 es mayor lo agregamos y seguimos 
					// recorriendo it1 por si es mas grande q la lista 2
					list3.insertInOrder(it1.getInfo());
					it1.avanzar();
				}
			}		
		}
 		
 		System.out.println(list3.getSize());
		System.out.println(list3);
		// 2 3 97
	}
}
