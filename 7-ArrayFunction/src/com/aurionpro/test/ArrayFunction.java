package com.aurionpro.test;
class Array{
	int sum=0;
	void sum(int array[]){
		int j;
		for(j=0;j<array.length;j++) {
			sum=sum+array[j];
		}
		System.out.println("The sum of array is : "+sum);
	}
	void average(int array[]) {
		System.out.println("Average of array elements is :"+sum/array.length);// average of array
	}
	void min(int array[]) {
		int k;
		int min=array[0];
		for(k=0;k<array.length;k++) {
			if(min>array[k]) {
				min=array[k];  // to find minimum of all array element 
			}
		}
		System.out.println("Minimum off all the elements in array is "+min);
	}
	void max(int array[]) {
		int k;
		int max=array[0];
		for(k=0;k<array.length;k++) {
			if(max<array[k]) {
				max=array[k];// to find maximum of all array elements
			}
		}
		System.out.println("The maximum of array is:"+ max);
	}
	void median(int array[]) {
		int length=array.length;
		System.out.println("The median of array is "+array[length/2]);// finding the median of array 
	}
	void frequency(int array[]) {
		int i,j;
		int count=0;
		for(i=0;i<array.length;i++) {
			for(j=0;j<array.length;j++) {
				if(array[i] == array[j]){
					count++;
				}
			}
			System.out.println("Frequency of "+array[i]+ " is :"+count);
			count=0;
		}	
	}
}
class ArrayFunction{
	public static void main(String args[]) {
		System.out.println("Array Statistics");
		Array a=new Array();
		int array[]=new int[args.length];
		for(int i=0;i<args.length;i++) {
			array[i]=Integer.parseInt(args[i]); //converting string into array 
		}
		a.sum(array);
		a.average(array);
		a.min(array);
		a.max(array);
		a.median(array);
		a.frequency(array);
	}
}