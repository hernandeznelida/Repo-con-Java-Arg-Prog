package PaqueteN1;

public class Clase4Ejercicio1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	private static int[] ordenarNumeros(int num1, int num2, int num3, char AoD) {
		int[] numeros= new int[3];
		int mayor=0, medio=0, menor=0;
		
		if ((num1 > num2) && (num1 > num3)) {

		    mayor=num1;

		    if (num2 > num3) {

		        medio=num2;

		        menor=num3;

		    }else {

		        medio=num3;

		        menor=num2;

		    }

		}

		else{

			if ((num2 > num3) && (num2 > num1)) {
	
				mayor=num2;
	
			    if (num1 > num3) {
	
			        medio=num1;
	
			        menor=num3;
	
			    }else {
	
			        medio=num3;
	
			        menor=num1;
	
			    }
	
			}else {
	
			    mayor=num3;
	
			    if (num2 > num1) {
	
			        medio=num2;
	
			        menor=num1;
	
			    }else {
	
			        medio=num1;
	
			        menor=num2;

		        }

		    }

		}
		
		if(AoD=='a') {
			numeros[0]=menor;
			numeros[1]=medio;
			numeros[2]=mayor;
		}
		else {
			numeros[0]=mayor;
			numeros[1]=medio;
			numeros[2]=menor;
		}
		
		return numeros;
	}

}
