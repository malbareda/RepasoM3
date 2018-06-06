import java.util.Scanner;

public class Penjat {
	
	static char[] palabra = {'g','a','t','o','s'};
	static char[] incognita = new char[5];
	static int errormax = 5;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int error=0;
		boolean victoria=false;
		while(!victoria && error<5) {
			
			char c = leer();
			//System.out.println(c);
			boolean acierto = comprobar(c,palabra);
			System.out.println(acierto);
			if(acierto) {
				 victoria = destapar(c,incognita,palabra);
			}else {
				error++;
			}
			
			
		}
	}

	private static boolean destapar(char c, char[] incognita2, char[] palabra2) {
		for(int i =0;i<5;i++) {
			if(c==palabra[i]) {
				incognita[i]=c;
			}
		}
		int asteriscos=0;
		for(int i=0;i<5;i++) {
			if(palabra[i]=='*') {
				asteriscos++;
			}
		}
		if(asteriscos==0) {
			return true;
		}else {
			return false;
		}
		
	}

	private static boolean comprobar(char c, char[] palabra2) {
		/*
		 boolean res = false; 
		 for(char caracter : palabra) {
		 
			if(caracter==c) {
				res = true;
			}
		}
		return res;
		*/
		
		for(int i=0;i<palabra.length;i++) {
			if(c==palabra[i]) {
				return true;
			}
		}
		return false;
	}

	private static char leer() {
		char c =  sc.next().charAt(0);
		return c;
		
	}
}
