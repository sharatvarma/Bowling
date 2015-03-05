import java.util.Scanner;

public class Baby 
{
	public static int add(int x,int y){

	int z=x+y;
	return z;
	
	}
	public static void main(String[] args) 
	{
		Scanner userInputScanner = new Scanner(System.in);
		System.out.println("enter the first number");
		int firstNumber = userInputScanner.nextInt();
		
		System.out.println("enter second number");
		int secondNumber = userInputScanner.nextInt();
		
		Baby c1=new Baby();
		int A=c1.add(firstNumber,secondNumber);
		
		System.out.println("Hello Sharat");
		System.out.println("Sum is  "  +  A);


		// TODO Auto-generated method stub
		

	}

}
