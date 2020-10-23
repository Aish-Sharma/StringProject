package com.app;

public class JoinString {

	public static void main(String[] args) {
		
		String s1 = "HelloJava";
		String s2 = s1.substring(5);
		System.out.println(s2); // Java
		System.out.println(s2.hashCode());
		String s3 = "Java";
		System.out.println(s3.hashCode());
		
		
		String s4 = new String("SachinTendulkar");
		String s5=s4.substring(6);
		System.out.println(s5.hashCode());
		
		String s6 = "Tendulkar";
		System.out.println(s6.hashCode());
		
	}

}
