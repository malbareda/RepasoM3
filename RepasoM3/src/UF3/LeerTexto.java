package UF3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class LeerTexto {
	
	public static void main(String[] args) {
		
		try {


			FileReader fr = new FileReader("texto.txt");
			BufferedReader br = new BufferedReader(fr);

		String marc;
		while(br.ready()) {
			marc = br.readLine();
			System.out.println(marc);
		}
		br.close();
		fr.close();
		
		
		
		
		
		} catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}
		
		
		
	}

}
