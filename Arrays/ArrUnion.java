// Given two unsorted arrays that represent two sets , Find union .


/*********************  USING HASHMAP *************************/


import java.util.*;

public class ArrUnion {

	static void union(int a[],int b[],int m,int n)
	{
		HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<m;i++)
		{
			map.put(a[i],i);
		}
		for(int i=0;i<n;i++)
		{
			map.put(b[i],i);
		}
		
		for(Map.Entry<Integer, Integer>mp : map.entrySet())
		{
			System.out.println(mp.getKey()+ " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of elements in array 1 and array 2 : ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int arr1[] = new int[m];
		int arr2[] = new int[n];
		
		System.out.println("Enter the elements of array1 : ");
		for(int i=0;i<m;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the elements of array2 : ");
		for(int i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		union(arr1,arr2,m,n);
	}

}

