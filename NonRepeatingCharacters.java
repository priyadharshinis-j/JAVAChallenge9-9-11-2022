package javaChallenge9;

import java.util.Scanner;

//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//
//Example 1:
//
//Input: s = "leetcode"
//Output: 0
//Example 2:
//
//Input: s = "loveleetcode"
//Output: 2
//Example 3:
//
//Input: s = "aabb"
//Output: -1

public class NonRepeatingCharacters {
	
	public static void main(String[] args) {
		System.out.println("Enter the string");
		System.out.println("=======================");
		Scanner sc = new Scanner(System.in);
		
		String string = sc.nextLine();
		
		sc.close();
		char[] charArray = string.toCharArray();
		
		int count=0;
		int i=0;
		for(i=0;i<=charArray.length-1;i++)
		{
			count=0;
			for(int j=0;j<=charArray.length-1;j++)
			{
				if(charArray[i]==charArray[j]&&i!=j)
				{
					count++;
					
					
				}
				
				
			}
		
		if(count==0)
		{
			System.out.println("Index position of the Element "+i);
			break;
		}
		else if(count>=1&&i==charArray.length-1)
		{
			System.out.println(-1);
		}
		else
			continue;
		}
	}

}
