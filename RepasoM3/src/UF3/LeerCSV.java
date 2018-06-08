package UF3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class LeerCSV {
	
	public static void main(String[] args) {
		
		try {


			FileReader fr = new FileReader("texto.csrv");
			BufferedReader br = new BufferedReader(fr);

		String marc;
		while(br.ready()) {
			marc = br.readLine();
			String array[] = marc.split(",");
			for(String s : array) {
				System.out.print(s+" ");
			}
			
			System.out.println(Integer.parseInt(array[1])+Integer.parseInt(array[2]));
		}
		br.close();
		fr.close();
		
		
		
		
		
		} catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}
		
		
		
	}

}
