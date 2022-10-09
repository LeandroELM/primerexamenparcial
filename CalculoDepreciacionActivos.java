package Examen;

import java.util.Scanner;

public class CalculoDepreciacionActivos {
	
	static Scanner lector=new Scanner(System.in);
	public static void main(String[] args) {
		 double costact, frac;
	        int vidautil, valordesecho,valorsalva,valoract, impordepre, vidautiluni;
			
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
				
				System.out.println("Ingrese el costo del activo");
				costact=lector.nextDouble();
				System.out.println("Ingrese el valor de desecho.");
				valordesecho=lector.nextInt();
				System.out.println("Ingrese la vida util.");
				vidautil= lector.nextInt();
				System.out.println("Su depreciacion anual es:" + MtdelineaRecta(costact, valordesecho, vidautil));
				break;
			}
			case 2:{
				System.out.println("Ingrese el valor del importe depreciable");
				impordepre=lector.nextInt();
				System.out.println("Ingrese la fraccion");
				frac=lector.nextDouble();
				System.out.println("La depreciacion anual por este metodo es de: " + MtdelasumadeDigitosporaños(impordepre, frac));	
				break;	
			}
			case 3:{
				System.out.println("Ingrese el costo del activo.");
				costact=lector.nextDouble();
				System.out.println("Ingrese el valor de desecho.");
				valordesecho=lector.nextInt();
				System.out.println("Ingrese la vida util");
				vidautiluni=lector.nextInt();
				System.out.println("La depreciacion anual por este metodo es de: " + MtporUnidePro(costact, valordesecho, vidautiluni));
				break;
				
				
			}
			case 4:{
				System.out.println("Ingrese el costo del activo.");
				costact=lector.nextDouble();
				System.out.println("Ingrese el valor de salvamento.");
				valorsalva=lector.nextInt();
				System.out.println("Ingrese el valor activo");
				valoract=lector.nextInt();
				System.out.println("La depreciacion anual por este metodo es de: " + MtporReducdeSaldos(costact, valorsalva, valoract));
				break;
				
				
			}
			
				
				
				
			}
			 System.out.println("Hice lo que pude :D");
		}
			private static double MtdelineaRecta( double costact , int valordesecho, int vidautil) {
		      	  double depreciacionanual;
		      	  
		      	  depreciacionanual = (costact - valordesecho) / (vidautil);
					return depreciacionanual;
		}
			 private static double MtdelasumadeDigitosporaños(int importdepre , double frac) {
	       	  double  depreciacionanual;
	       	  
	       	  depreciacionanual = importdepre * frac;
	       	 
				return depreciacionanual;
			 }
			 
			 private static double MtporUnidePro(double costact,int valordesecho, int vidautiluni   ) {
				 double depreciacionanual;
				 depreciacionanual= (costact-valordesecho)/vidautiluni;
				 
				 return depreciacionanual;
			 } 
			 private static double MtporReducdeSaldos(double costact, int valorsalv, double vidautil) {
				 double depreciacionanual,residuo;
				 depreciacionanual= 1-(valorsalv/costact);Math.pow(vidautil, 1); 
				 residuo=depreciacionanual*(-100);
				 residuo=depreciacionanual*costact;
				 
				 
				 return residuo;
				
			 }
			 
			 }



