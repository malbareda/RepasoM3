package UF3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;

public class LeerBin {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("binarios.bin.binarios.bin.b.benta");
			ObjectInputStream ois = new ObjectInputStream(fis);

			for (int i = 0; i < 10; i++) {
				String s="";
				s+=ois.readInt()+" ";
				s+=ois.readInt()+" ";
				s+=ois.readChar()+" ";
				s+=ois.readDouble()+" ";
				System.out.println(s);
			}
			
			
			
		} catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}

	}

}
