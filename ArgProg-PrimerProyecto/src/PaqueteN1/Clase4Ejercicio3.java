package PaqueteN1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Clase4Ejercicio3 {

	public static void main(String[] args) throws FileNotFoundException {
		File archivo = new File("C:\\Users\\Fabricio\\miprimerarchivoent.txt");

		int sumaInt=0;

		Scanner sumaNumeros = new Scanner(archivo);

		while (sumaNumeros.hasNextInt()) {

			sumaInt = sumaInt + sumaNumeros.nextInt();

		}
		sumaNumeros.close();

	    System.out.println("La suma es: "+ sumaInt);
  
	}
}
