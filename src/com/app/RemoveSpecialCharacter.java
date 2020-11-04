package com.app;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
	String str=	"$ja%va#@";
	System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

	}

}
