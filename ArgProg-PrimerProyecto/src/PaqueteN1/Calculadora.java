package PaqueteN1;

import java.util.Scanner;

public class Calculadora {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		int a=0;
		while(a!=6) {
			System.out.println("----------Menu--------------");
			System.out.println("Seleccione un numero para la operacion que desea realizar: ");
			System.out.println("1. +");
			System.out.println("2. -");
			System.out.println("3. *");
			System.out.println("4. /");
			System.out.println("5. limpiar");
			System.out.println("6. salir");
			
			String opcion= entrada.nextLine();

			System.out.println("Ingrese un numero: ");
			double num1=entrada.nextDouble();
			System.out.println("Ingrese el segundo numero: ");
			double num2=entrada.nextDouble();
			
			
			switch(opcion) {
			case "1": System.out.println("La suma es: " + sumar(num1, num2));
			break;
			
			case "2": System.out.println("La resta es: " + restar(num1, num2));
			break;
			
			case "3": System.out.println("La multiplicacion es: " + multiplicar(num1, num2));
			break;
			
			case "4": System.out.println("La division es: " + dividir(num1, num2));
			break;
			
			case "5": num1=0;
			    num2=0;
			    opcion="";
			break;
			
			case "6": a=6;
			break;
			
			default: System.out.println("operacion finalizada");
			break;
			}
		}
		
	}
	
	static double sumar(double unNumero, double otroNumero) {
		
		return unNumero + otroNumero;
	}
	
	static double restar(double unNumero, double otroNumero) {
		
		return unNumero - otroNumero;
	}

	static double multiplicar(double unNumero, double otroNumero) {
	
	return unNumero * otroNumero;
	}

	static double dividir(double unNumero, double otroNumero) {
	
	return unNumero / otroNumero;
	}

}
