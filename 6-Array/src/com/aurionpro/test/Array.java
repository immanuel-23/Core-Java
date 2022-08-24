package com.aurionpro.test;

public class Array {

		public static void main(String args[]) {
			System.out.println("Array Statistics");
			int array[]=new int[args.length];
			int i;
			int j;
			int k;
			int sum=0;
			int count=0;
			int temp_array[]=new int[args.length];
			for(i=0;i<args.length;i++) {
			array[i]=Integer.parseInt(args[i]); //converting string into array 
			}
			int min=array[0];
			int max = array[0];
				
			for(j=0;j<args.length;j++) {
				sum=sum+array[j];
			}
			
				
			System.out.println("Sum of array elements is :"+sum);
			System.out.println("Average of array elements is :"+sum/array.length);// average of array
			
			for(k=0;k<args.length;k++) {
				if(min>array[k]) {
					min=array[k];  // to find minimum of all array element 
				}
			}
			System.out.println("Minimum off all the elements in array is "+min);
			
			for(k=0;k<args.length;k++) {
				if(max<array[k]) {
					max=array[k];// to find maximum of all array elements
				}
			}
			System.out.println("Maximum off all the elements in array is "+max);
			
			int length=args.length;
			System.out.println("The median of array is "+array[length/2]);// finding the median of array 
			
			for(i=0;i<args.length;i++) {
				for(j=0;j<args.length;j++) {
					if(array[i] == array[j]){
						count++;
					}
				}
				
				System.out.println("Frequency of "+array[i]+ "is :"+count);
				count=0;
			}
			
		}
		
	
	

}
