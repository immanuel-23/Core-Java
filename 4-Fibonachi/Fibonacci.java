import java.util.*;
class Fibonacci{
	public static void main (String args[]){
		System.out.println("program to find the fibonachi series");
		int num1=0;
		int num2=1;
		int temp;
		int user_entered_number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		user_entered_number=sc.nextInt();
		

		int i;
		for(i=2;i<user_entered_number;i++){
			temp=num1+num2;
			num1=num2;
			num2=temp;
			System.out.println(temp); 
		}
	}
}
