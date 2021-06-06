// An array contains both positive and negative numbers in random order.

// Rearrange the array elements so that all negative numbers appear before all positive numbers.


/*************************USING TWO-POINTER APPROACH***************************************/
import java.util.*;
public class Move_Negative {
	
	static void move(int arr[])
	{
		int strt=0;int end = arr.length-1;
		while(strt<=end)
		{
			if(arr[strt]<0 && arr[end]<0)
			{
				strt++;
			}
			else if(arr[strt]>0 && arr[end]<0)
			{
				int temp = arr[strt];
				arr[strt]=arr[end];
				arr[end]=temp;
				strt++;
				end--;
			}
			else if(arr[strt]>0 && arr[end]>0)
			{
				end--;
			}
			else
			{
				strt++;
				end--;
			}
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements in the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for(int i= 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		move(arr);
		System.out.println("After Sorting");
		for(int i= 0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
