package UF3;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.Random;

public class EscribirBin {

	public static void main(String[] args) {

		try {

			File f = new File("binarios.bin.binarios.bin.b.benta");
			FileOutputStream fol = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fol);

			Random r = new Random();
			
			for (int i = 0; i < 10; i++) {
				oos.writeInt(i);
				oos.writeInt(r.nextInt(100));
				oos.writeChar('a');
				oos.writeDouble(r.nextDouble());
			}
			oos.flush(); // opcional
			oos.close();

		} catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}

	}
}