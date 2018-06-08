package UF3;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

public class EscribirListSerial {

	public static void main(String[] args) {

		try {

			File f = new File("serializacion.escroto");
			FileOutputStream fol = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fol);
			ArrayList<PP> peperos = new ArrayList<>();
			Random r = new Random();
			
			for (int i = 0; i < 10; i++) {
				int nr = r.nextInt(2);
				if(nr==0) {
					MPuntoRajoy mariano = new MPuntoRajoy(Integer.MAX_VALUE, new Sobres(), i);
					peperos.add(mariano);
				}
				else if (nr==1) {
					LuisSeFuerte barcenas = new LuisSeFuerte(Integer.MAX_VALUE, new Sobres(), i);
					peperos.add(barcenas);
				}
				

			}
			oos.writeObject(peperos);
			oos.flush(); // opcional
			oos.close();

		} catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}

	}
}