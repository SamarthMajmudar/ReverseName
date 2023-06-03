import java.util.Scanner; 
public class ReverseName
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String name; 
		System.out.println("What is your name?");
		name = kb.next(); 
		char[] array = name.toCharArray();
		
		
		for (int count = array.length-1; count >= 0; count--)
		{
			System.out.print(array[count]);
		}
	}
} 
		
		
		
				