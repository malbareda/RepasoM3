import java.util.Scanner;

public class PenjatStrings {
	
	static String palabra = "gatos";
	static String incognita = "*****";
	static int errormax = 5;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int error=0;
		boolean victoria=false;
		while(!victoria && error<5) {
			
			String c = leer();
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

	private static boolean destapar(String c, String incognita2, String palabra2) {
		char[] ainc = incognita.toCharArray();
		char[] apal = palabra.toCharArray();
		for(int i =0;i<5;i++) {
			if(c.charAt(0)==apal[i]) {
				ainc[i]=c.charAt(0);
			}
		}
		return incognita.contains("*");
		
	}

	private static boolean comprobar(String c, String palabra2) {
		return palabra.contains(c);
	}

	private static String leer() {
		String c =  sc.next();
		return c;
		
	}
}
