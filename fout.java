import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fout
{
	
	public static void main(String[] args) throws IOException
	{
		
		System.out.print("Enter the name with extention : ");
		Scanner paoloinput = new Scanner(System.in);
		
		File paoloFile = new File( paoloinput.nextLine()+".PC");
		paoloinput = new Scanner(paoloFile);
		
		String paoloLine = paoloinput.nextLine();
		System.out.println(paoloLine);
		
		paoloinput.close();
	}
}