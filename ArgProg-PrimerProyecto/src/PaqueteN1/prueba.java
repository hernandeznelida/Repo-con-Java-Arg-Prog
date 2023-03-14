package PaqueteN1;

public class prueba {
	  public static void main(String[] args) {
	    try {
	      int[] arreglo = new int[5];
	      arreglo[10] = 20;
	    } catch (ArrayIndexOutOfBoundsException e) {
	      System.out.println("Se produjo una excepción: " + e);
	    }
	    System.out.println("El programa continúa su ejecución.");
	  }
	}