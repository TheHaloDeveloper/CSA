import static java.lang.System.*; 
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a word :: ");
		String word = keyboard.next();
        
		StringStuff s = new StringStuff( word );
		System.out.println( "has even length " + s.isEvenLength() );
		System.out.println( "has same first last letters " + s.sameFirstLastLetters() );
		System.out.println( "ends with cat " + s.endsWith( "cat" ) );
	}
}