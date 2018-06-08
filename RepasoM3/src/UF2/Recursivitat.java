package UF2;

public class Recursivitat {

	
	public static void main(String[] args) {
		System.out.println(piramiderec(4));
		System.out.println(MierdasDelGrego(25));
		int[] array = {3,6,2,8,6,5,4,9,2,1};
		System.out.println(sumaArray(array, 0));
	}
	
	


	private static int piramiderec(int pisos) {
		///CASO BASE
		if(pisos==1) {
			return 1;
		}else {
			//CASO REC
			return pisos+piramiderec(pisos-1);
		}
	}
	
	
	static int sumaArray(int[] array, int pos) {
		////CASO BASE
		if(pos==array.length-1) {
			return array[pos];
		}else {
		///CASO RECURSIVO
			return sumaArray(array,pos+1)+array[pos];
			
		}
		
		
	}
	private static int MierdasDelGrego(int n) {
		///CASO BASE
		if(n==1) {
			return 1;
		}else {
			//CASO REC
			if(n%2==0) {
				//par
				n/=2;
				return 1+MierdasDelGrego(n);
				
			}else {
				//impar
				n++;
				return 1+MierdasDelGrego(n);
			}
		}
	}
	
	
	
	
}
