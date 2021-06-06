// Given an array, cyclically rotate the array clockwise by one.

import java.util.*;

public class Rotate_Array {
	static void rotate(int arr[],int n)
	{
		int temp = arr[n-1];
		for(int i=n-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n = sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		rotate(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
