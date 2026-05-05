package com.examplea;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
	public static void main(String[] args) {
		/*
		 * ¿Que es un Map Interface, o un mapa simplemente?
		 * 
		 * Es una coleccion, aunque no hereda de la interfaz collections pero se puede
		 * tratar como tal utilizando las collections Views (vistas de colecciones) que
		 * veremos en breve
		 * 
		 * concretamente un mapa es una coleccion tambien denominado un objeto que
		 * relaciona claves con valores, lo que antiguamente se llamaba una estructura
		 * hash (clave (key) y valor (value)) donde las claves no pueden repetirse
		 * 
		 * Los metodos de ordenamiento y de busqueda que son aplicables a las interfaces
		 * que heredan de collection no son aplicables a la interface map por ejemplo el
		 * metodo sort no se le puede aplicar a un mapa
		 * 
		 * En resumen una interface map, mapea (relaciona) claves com valor en un
		 * contenedor que se pueden crear de varias formas y rocorrer de varias formas
		 * tambien
		 */

		/*
		 * A modo de ejemplo vamos a crear una coleccion (Map Interface) que alamacene
		 * la frecuencia de repeticion/ocurrencia de un Array de palabras que se reciben
		 * como paremetro en el metodo main, cuando se lanza la aplicacion
		 */

		// primero comprobar si estamos reciviendo el array de nombres en la variable
		// args
		// cuando se lanza la aplicacion

		List<String> listadoDeArgumentos = Arrays.asList(args);
		listadoDeArgumentos.forEach(System.out::println);

		/* Creacion del mapa a partir del listado de argumentos */

		Map<String, Integer> m = new HashMap<>();

		/*
		 * Para agregar entradas al mapa m recorreremos la lista listadoDeArgumentos
		 * ulizando una sentencia for mejorada
		 */

		Integer frecuenciaOcurrencia = null;

		for (String nombre : listadoDeArgumentos) {
			// comprobar si el nombre, clave ya se encuentra en el mapa m

			frecuenciaOcurrencia = m.get(nombre);
			m.put(nombre, frecuenciaOcurrencia == null
					? 1
					: ++ frecuenciaOcurrencia);
		}
		
		System.out.println("Mapa resultante " + m);

	}
}
