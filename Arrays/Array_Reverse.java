//Reverse an array


import java.util.*;
public class Array_Reverse {

	public static void reverse_arr(int arr[])
	{
		int start=0,end=arr.length-1,temp=0;
		while(start<end)
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	jhbff
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
		
		reverse_arr(arr);
		System.out.println("Reversed Array : ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}

}
