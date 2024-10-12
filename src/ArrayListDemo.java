import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		System.out.println("Tamaño del array 'numeros': " + numeros.size());		
		numeros.add(35); numeros.add(33); numeros.add(42);
		numeros.add(10); numeros.add(14); numeros.add(19);
		numeros.add(27); numeros.add(44); numeros.add(26);
		numeros.add(31); numeros.add(33);
		
		System.out.println("Tamaño del array 'numeros': " + numeros.size());
		
		System.out.println(numeros.get(5));//traer el numero 19
		System.out.println(numeros.get(10));//trae el numero 33 
		//numeros.clear();//Elimina todos los elementos del array
		System.out.println(numeros.isEmpty());//muestra bool si esta vacío
		System.out.println(numeros.indexOf(33));//Muestra el indice de la primera ocurrencia que es el 1
		System.out.println(numeros.lastIndexOf(33));//Muestra el indice de la última ocurrencia que es el 10
		System.out.println(numeros.contains(44));//Muestra bool si contiene ese elemento
		numeros.add(6, 21);//Agrega un elemento en la posicion en este caso 6 y recorre al otro elemento al siguiente indice
		System.out.println("Tamaño del array 'numeros': " + numeros.size());		
		System.out.println(numeros.get(6));//traer el numero 21
		System.out.println(numeros.get(7));//traer el numero 27
		System.out.println(numeros.set(11, 23));
		System.out.println(numeros.get(11));//traer el numero 23
		System.out.println(numeros.remove(3));//Elimina o remueve el numero 10
		System.out.println("***************************************************");
		//for (Integer numero : numeros) {
			//System.out.println(numero);
		//}//foreach
		
		numeros.forEach((numero) -> imprimirNumerosImpares(numero));
		
		
	}//main

	private static void imprimirNumerosImpares(Integer numero) {
		if(numero % 2 == 0) {
			System.out.println(numero + " es numero par");
		}else {
			System.out.println(numero + " es numero impar");
		}//else
	}//imprimirParesImpares
}//class ArrayListDemo
