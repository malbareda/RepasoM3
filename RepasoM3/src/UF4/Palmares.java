package UF4;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Palmares {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("Palmares");
			DataInputStream dis = new DataInputStream(fis);
			
			while(true) {
				int a = dis.readInt();
				System.out.println(a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Fin de fichero");
		}
		
		
	}

}
