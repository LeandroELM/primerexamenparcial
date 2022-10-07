package Examen;

import java.util.Scanner;

public class CalculoDepreciacionActivos {
	static double costdelact;
	static double depreacum;
	static double vidautil;
	static Scanner lector=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("---------------Bienvenido-------------");
		System.out.println();
		System.out.println("Ingrese que metodo desea usar:");
		System.out.println();
		System.out.println("1. Metodo de linea recta.");
		System.out.println("2. Metodo de la suma de los digitos por año.");
		System.out.println("3. metodo de las unidades producidas.");
		System.out.println("4. Metodo de reduccion de saldos.");
		System.out.println();
		System.out.println("--------------------------------------");
		int op = lector.nextInt();
		
		switch (op) {
		
		case 1: {
			System.out.println("Que desea depresiar?");
			double cosa = lector.nextDouble();
			double costact,valordesecho,vidautil;
			System.out.println("Ingrese el costo del activo");
			costact=lector.nextDouble();
			System.out.println("Ingrese el valor de desecho.");
			valordesecho=lector.nextDouble();
			System.out.println("Ingrese la vida util.");
			vidautil=lector.nextDouble();
			depreacum=costact-cosa;
			cosa= (costact-valordesecho)/vidautil;
			System.out.println("Su depresiacion anual es:" + cosa);
			System.out.println("Su depresion acumulada es: " + depreacum);
		
			
			break;
			
			
		}
		case 2:{
			System.out.println("Que desea depresiar?");
			break;
			
			
			
		}
		case 3:{
			System.out.println("Que desea depresiar?");
			break;
			
			
		}
		case 4:{
			System.out.println("Que desea depresiar?");
			break;
			
			
		}
	
		
		
		
		
		
		}


	}
	
		
		
	}
		
		
		
	


