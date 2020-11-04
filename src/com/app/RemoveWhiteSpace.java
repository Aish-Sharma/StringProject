package com.app;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str=	"  j a   v a ";
		
		System.out.println(str.replaceAll("\\s", ""));
	}

}
