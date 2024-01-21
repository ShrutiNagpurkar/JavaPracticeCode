import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTestFile {

	public static void main(String[] args) throws IOException {
		
		//Method 1 : Using FileReader and BufferedReader
		FileReader fe = new FileReader("C:\\Users\\HP\\OneDrive\\Desktop\\DummyTextForCoding.txt");
		BufferedReader br = new BufferedReader(fe);
		String str= br.readLine();
		while(str!=null)
		{
			System.out.println(str);
			break;
		}
		br.close();
		
		//Method 2: Using Scanner and File
		File f = new File("C:\\Users\\HP\\OneDrive\\Desktop\\DummyTextForCoding.txt");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		//Method 3 : 
		sc.useDelimiter("\\Z");
		System.out.println(sc.nextLine());
		
	}
}
