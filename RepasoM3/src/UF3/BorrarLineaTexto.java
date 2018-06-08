package UF3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BorrarLineaTexto {

	public static void main(String[] args) {

		try {
			File f = new File("texto.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			File f2 = new File("texto2.txt");
			FileWriter fw = new FileWriter(f2);
			BufferedWriter bw = new BufferedWriter(fw);

			String marc;
			//int linea = 3;
			String frase = "Gatete3";
			int contador = 1;
			while (br.ready()) {
				marc = br.readLine();
				if (!marc.equals(frase)) {
					bw.write(marc);
					bw.newLine();
				}
				contador++;
			}
			bw.flush();
			bw.close();
			br.close();
			fr.close();
			
			
			f.delete();
			System.out.println(f2.renameTo(f));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
