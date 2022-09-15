package com.slot2junit;

public class strlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="bhaskarasai";
		int count=0;
		for(char n:name.toCharArray()) {
			count++;
		}
		System.out.println("The length of "+name+" is "+count);
	}

}
