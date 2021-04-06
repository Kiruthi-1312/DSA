//Maximum and minimum of an array using minimum number of comparisons


import java.util.*;

public class Min_Max {
	
	public static class Pair{
		int min,max;
	}
	
	 static Pair min_max(int arr[])
	 {
		 Pair minmax = new Pair();
		 
		 int n =arr.length;
		 
		 if(n==1)
		 {
			 minmax.min=arr[0];
			 minmax.max=arr[0];
			 return minmax;
		 }
		 if(arr[0]>arr[1])
		 {
			 minmax.min=arr[1];
			 minmax.max=arr[0];
		 }
		 else
		 {
			 minmax.min=arr[0];
			 minmax.max=arr[1];
		 }
		 
		 for(int i=2;i<n;i++)
		 {
			 if(arr[i] > minmax.max)
				 minmax.max=arr[i];
			 else if(arr[i]<minmax.min)
				 minmax.min=arr[i];
		 }
		 return minmax;
	 }
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements in the array : ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Minimum element : "+min_max(arr).min);
		System.out.println("Maximum element : "+min_max(arr).max);
	}
}
