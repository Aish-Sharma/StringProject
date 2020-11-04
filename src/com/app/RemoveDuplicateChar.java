package com.app;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String str="programming";
		
		//1st Approach
		StringBuilder sb1=new StringBuilder();
		str.chars()
		.distinct()
		.forEach(ch->sb1.append((char)ch));
		System.out.println(sb1);
		
		//2nd Approach
		StringBuilder sb2=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int idx=str.indexOf(ch,i+1);
			if(idx==-1)
			{
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		
		//3rd Approach
		char[] chArr=str.toCharArray();
		StringBuilder sb3=new StringBuilder();
		for(int i=0;i<chArr.length;i++)
		{
			boolean repeated=false;
			for(int j=i+1;j<chArr.length;j++)
			{
			    if(chArr[i]==chArr[j])
				{
					repeated=true;
					break;
				}
			}
				if(!repeated)
				{
					sb3.append(chArr[i]);
				}
				
		}
		System.out.println(sb3);
		
		//4th Approach
		StringBuilder sb4=new StringBuilder();
		Set<Character> setvalue=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			setvalue.add(str.charAt(i));
		}
		for (Character character : setvalue) {
			sb4.append(character);
		}
		System.out.println(sb4);
		
	}

}
