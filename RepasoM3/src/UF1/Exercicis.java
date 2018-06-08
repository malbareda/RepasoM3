package UF1;

import java.util.Scanner;

public class Exercicis {
	
	static Scanner sc = new Scanner(System.in);

	static void guauguau() {
		System.out.println("guau guau");
	}
	
	
	
	static int fact(int elNumero) {
		int accf = 1;
		for(int k = elNumero;k!=0;k--) {
			accf = accf*k;
		}
		return accf;
	}
	
	static int sumatorio(int elNumero) {
		int accf = 0;
		for(int k = elNumero;k!=0;k--) {
			accf = accf+k;
		}
		return accf;
	}
	
	
	
	
	public static void main(String[] args) {
		/**
		 * Declaracion
		 *   static t_retorno nombre(t_arg n_arg, t_arg2 n_arg2,...){
		 * Llamada
		 *   nombre(arg1, arg2, ...);
		 */
		
		guauguau();
		System.out.println(fact(6));
		int nota1 = 5;
		int nota2 = 6;
		int nota3 = 4;
		String nota = avaluacio(nota1, nota2, nota3);
		System.out.println(nota);
		String estacio = estacio(6,6);
		System.out.println(estacio);
		int suma = sumatorio(6);
		System.out.println(suma);
		int bloques = piramide(4);
		System.out.println(bloques);
		sumateclado();
		
	}



	private static int piramide(int pisos) {
		// TODO Auto-generated method stub
		int acc = 0;
		for(int i =1; i<=pisos;i++) {
			//acc = acc + algo;
			acc = acc + i*i;
			//0 = 0+1
			//1 = 1+2*2
			//5 = 5+3*3
		}
		return acc;
	}
	
	
	
	static void sumateclado() {
		int acc = 0;
		int n = sc.nextInt();
		while(n!=0) {
			//acumular numeros
			//sumar
			//volver a leer
			acc = acc + n;
			n = sc.nextInt();
			
		}
		System.out.println(acc);
	}



	private static String estacio(int mes, int dia) {
		String estacio = "INVALID";
		switch(mes) {
		case 12:
			if(dia>21) {
				estacio = "INV";
			}else {
				estacio = "OTO";
			}
			break;
		case 3:
			if(dia>21) {
				estacio = "PRI";
			}else {
				estacio = "INV";
			}
			break;
		case 6:
			if(dia>21) {
				estacio = "VER";
			}else {
				estacio = "PRI";
			}
			break;
		case 9:
			if(dia>21) {
				estacio = "OTO";
			}else {
				estacio = "VER";
			}
			break;
		case 1:
		case 2:
			estacio = "INV";
			break;
		case 4:
		case 5:
			estacio = "PRI";
			break;
		case 7:
		case 8:
			estacio = "VER";
			break;
		case 10:
		case 11:
			estacio = "OTO";
			break;
		
		
		}
		return estacio;
	}



	private static String avaluacio(int nota1, int nota2, int nota3) {
		int media = (nota1+nota2+nota3)/3;
		if(nota1>0&&nota2>0&&nota3>0) {
			if(media>=5) {
				return "Aprova";
			}else {
				return "SUSPÈS";
			}
		}else {
			return "NP";
		}
		

	}
	
	
	
	
	
	
	
}
