// Given an array A[] consisting 0s, 1s and 2s.
// The task is to write a function that sorts the given array. The functions should put all 0s first, then all 1s and all 2s in last.


/******* DUTCH NATIONAL FLAG APPROACH ********/

import java.util.*;
public class Sort012 {

	public static void sort(int arr[],int n)
	{
		int start=0,mid=0,high=n-1;
		
		while(mid<=high) {
			if(arr[mid]==0)
			{
				int temp = arr[mid];
				arr[mid] = arr[start];
				arr[start] = temp;
				start++;
				mid++;
			}
			else if(arr[mid]==1)
			{
				mid++;
			}
			else
			{
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high]=temp;
				high--;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the elements (0,1,2) : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		sort(arr,n);
		System.out.println("Sorted Array : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
