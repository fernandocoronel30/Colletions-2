import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> colores = new HashMap<String, String>();
		colores.put("RED", "#FF0000");
		colores.put("GREEN", "#00FF00");
		colores.put("BLUE", "#0000FF");
		colores.put("WHITE", "#FFFFFF");
		colores.put("BLACK", "#000000");
		colores.put("FUCHSIA", "#FF00FF");
		colores.put("PINK", "#FFC8CB");
		colores.put("YELLOW", "#FFFF00");
		colores.put("CYAN", "#00FFFF");
		
		System.out.println(colores.put("NAVY", "#000080"));//null
		System.out.println(colores.put("NAVY", "#000088"));//#000080
		System.out.println(colores.size());//10
		System.out.println(colores.get("CYAN"));//#00FFFF
		
		System.out.println("**********KEYS************");
		for (String key : colores.keySet()) {
			System.out.println(key + "=" + colores.get(key));
		}//foreach de los keys
		
		System.out.println("**********VALUES************");
		for (String values : colores.values()) {
			System.out.println(values);
		}//foreach de los values
		
		colores.forEach((key, value) -> mostrar(key,value));
		
	}//main

	private static void mostrar(String key, String value) {
		System.out.println("**************************");
		System.out.println("| " + key + " -> " + value);
		System.out.println("**************************");
	}//mostrar
}//class HashMapDemo
