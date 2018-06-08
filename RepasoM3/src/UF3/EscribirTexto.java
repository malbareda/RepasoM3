package UF3;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class EscribirTexto {

	public static void main(String[] args) {

		try {

			File f = new File("texto.txt");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);


		String marc = "Gatete";
		for(int i=0;i<10;i++) {
			bw.write(marc+i+"\n");
			bw.newLine();
		}
		bw.flush();
		bw.close();
		fw.close();
		
		FileWriter fw2 = new FileWriter(f,true);
		BufferedWriter bw2 = new BufferedWriter(fw2);
		
		bw2.write("cosas de gatetes");
		bw2.flush();
		bw2.close();
		fw2.close();
		
		
		} catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}
		
	}
}
