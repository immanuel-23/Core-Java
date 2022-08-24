import java.util.*;

class Primenumber{
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your number ");
	int number=sc.nextInt();
	
	int i;
	int flag=1;
	for(i=2;i<=Math.sqrt(number);i++){
		if(number%i==0){
			flag=0;
		}
	}
	if(flag==1){
		System.out.println("Entered number is a prime number");
	}
	else{
		System.out.println("Entere number is not a prime number");
		}
	
	}
}

	
	
	