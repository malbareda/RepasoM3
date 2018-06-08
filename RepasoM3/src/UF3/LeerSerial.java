package UF3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;

public class LeerSerial {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("serializacion.escroto");
			ObjectInputStream ois = new ObjectInputStream(fis);

			MPuntoRajoy mariano;
			LuisSeFuerte barcenas;
			try {
				while (true) {
					Object o = ois.readObject();
					if(o instanceof MPuntoRajoy) {
						mariano = (MPuntoRajoy) o;
						System.out.println(mariano);	
					}else if(o instanceof LuisSeFuerte){
						barcenas = (LuisSeFuerte) o;
						System.out.println(barcenas);
					}
					
				}

			} catch (EOFException fin) {
				System.out.println("Fin de fichero");
				ois.close();
			}
			
			
			
			
		} catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}

	}

}
