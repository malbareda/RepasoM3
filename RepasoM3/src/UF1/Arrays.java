package UF1;
import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		
		
		int array[] = new int[10];
		int array2[] = {10,11,12,13,14};
		
		int a = array[0];
		int b = array2[2];
		
		System.out.println(a+" "+b);
		
		for(int i=0;i<array2.length;i++) {
			array2[i]++;
			System.out.println(array2[i]);
		}
		
		OcaDAM();
		
		
		
	}
	
	static void OcaDAM() {
		int usuario =0;
		int taulell[] = new int[32];  //Declararà un vector d’enters de 32 posicions
		for(int i=0;i<taulell.length;i++) {
			taulell[i]=0;
		}
		int casella1 = 4;
		int casella2 = 13;
		if(taulell[casella1]==0 && taulell[casella2]==0) 
		{
			taulell[casella1] = casella2;
			taulell[casella2] = casella1;
		}
		else {
				System.out.println("ERROR");
		}
		
		for(int i=0;i<taulell.length;i++) {
			System.out.println(taulell[i]);
			if(taulell[i]!=0) {
				System.out.println(taulell[taulell[i]]);
			}
			if(i==usuario) {
				System.out.println("x");
			}
		}
		
		System.out.println(usuario);
		
		int random1= (int)(Math.random()*6);
		Random rnd = new Random();
		int sorteo = rnd.nextInt(6);
		
		usuario = usuario+sorteo;
		if(usuario>32) {
			usuario=32;
		}
		if(taulell[usuario]!=0) {
			usuario = taulell[usuario];
		}
		System.out.println("estas en "+usuario);
		if(usuario==32) {
			System.out.println("iu are e winner");
		}
		
		
				
		
	}
		
		
	
}
