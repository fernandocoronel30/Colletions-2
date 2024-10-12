import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		System.out.println("Tamaño del array 'numeros': " + numeros.size());		
		numeros.add(35); numeros.add(33); numeros.add(42);
		numeros.add(10); numeros.add(14); numeros.add(19);
		numeros.add(27); numeros.add(44); numeros.add(26);
		numeros.add(31); numeros.add(33);
		
		Iterator<Integer> iterador = numeros.iterator();
		int total = 0;
		while (iterador.hasNext()) {
			total+= iterador.next();
		}//while
		System.out.println(total);		
	}//main
}//class ArrayListDemo
