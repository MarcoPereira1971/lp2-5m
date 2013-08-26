import java.util.Scanner;

public class Console {
	static Scanner scanner; 	
	public static void print(String out)
	{
		System.out.print(out);		
	}
	
	public static String scanString(String out)
	{
		scanner = new Scanner(System.in);
		System.out.print(out);
		return(scanner.nextLine());
	}
	
	public static int scanInt(String out)
	{
		scanner = new Scanner(System.in);
		System.out.print(out);
		return(scanner.nextInt());		
	}

	public static float scanFloat(String out)
	{
		System.out.print(out);
		scanner = new Scanner(System.in);
		return(scanner.nextFloat());		
	}
	public static double scanDouble(String out)
	{
		System.out.print(out);
		scanner = new Scanner(System.in);
		return(scanner.nextDouble());		
	}

	public static boolean scanBoolean(String out)
	{
		System.out.print(out);
		scanner = new Scanner(System.in);
		return(scanner.nextBoolean());		
	}
	
	public static char scanChar(String out)
	{
		System.out.print(out);
		scanner = new Scanner(System.in);
		return(scanner.next().charAt(0));				
	}
	
}
