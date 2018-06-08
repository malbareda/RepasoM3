package UF3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LeerListSerial {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("serializacion.escroto");
			ObjectInputStream ois = new ObjectInputStream(fis);

			ArrayList<PP> peperos = new ArrayList<>();
			Object o=ois.readObject();
			peperos=(ArrayList<PP>) o;
			
			
			
			
		} catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}

	}

}
