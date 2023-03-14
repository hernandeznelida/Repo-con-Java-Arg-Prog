package PaqueteN1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Clase4Ejercicio2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String ruta = "C:\\Users\\Fabricio\\miprimerarchivonum.txt";
		for (String linea : Files.readAllLines(Paths.get(ruta))){
			System.out.println(linea);
		}
	}
	
}


