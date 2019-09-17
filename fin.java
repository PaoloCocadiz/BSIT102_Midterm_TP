import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class fin 
{
	public static void main(String args[]) throws IOException
	{
		Scanner paoloScanner = new Scanner(System.in);
		String FileText;
		String paoloText;
		
		System.out.println("input File Text");
		FileText = paoloScanner.nextLine();
		System.out.println("Input File Name");
		paoloText = paoloScanner.nextLine();
		
		FileWriter paolofile = new FileWriter( paoloText+ ".PC");
		paolofile.write(FileText);
		paolofile.close();
	}
}