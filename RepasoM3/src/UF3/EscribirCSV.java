package UF3;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class EscribirCSV {

	public static void main(String[] args) {

		try {

			File f = new File("texto.csrv");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);


		String marc = "Gatete";
		for(int i=0;i<10;i++) {
			Random r = new Random();
			int rand = r.nextInt(100);
			bw.write(marc+","+i+","+rand);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		fw.close();
		
		
		
		} catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}
		
	}
}
