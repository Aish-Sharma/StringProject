package com.app;

public class ReverseStringDemo {
	public static void main(String[] args) {
		String str="Hello";
		
		char[] chArr= str.toCharArray();    //1st Approach
		for(int i=chArr.length-1;i>=0;i--)
		{
			System.out.print(chArr[i]);
		}
		
		System.out.println();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i)); //2nd Approach
		}
	}
	
	
	


}
