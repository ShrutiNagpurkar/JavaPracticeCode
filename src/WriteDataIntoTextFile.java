import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\DummyTextForCoding.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Java");
		bw.write("Python");
		bw.write(" C # ");
		System.out.println("Finished....");
		
		bw.close();
	}
}