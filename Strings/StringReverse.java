


//********************** SPACE COMPLEXITY : O(1) ***********************//
//********************** TIME  COMPLEXITY : O(n) ***********************//


import java.util.*;

public class StringReverse {

	public static void reverse(char[] str)
	{
		int left=0,right=str.length-1;
		
		while(left<right)
		{
			char temp = str[left];
			str[left++]=str[right];
			str[right--] = temp;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the string to be reversed : ");
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		
		char[] str1 = s1.toCharArray();
		reverse(str1);
		
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}
	}

}
