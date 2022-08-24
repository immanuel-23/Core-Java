import java.util.*;
class Factorial{
	public static void main(String args[]){
		System.out.println("Program to find the factorial of given number");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int number=sc.nextInt();
		int factorial=1;
		int i;
		for(i=1;i<=number;i++){
			factorial=factorial*i;
		}
		System.out.println("The factorial of given 2 number is "+factorial);
	}
}

	
			