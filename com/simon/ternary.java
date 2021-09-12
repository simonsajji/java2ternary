package com.simon;

public class ternary {
	
	public static void main(String[] args) {
		int x=40;
		int y=60;
		int z=35;
		String kin;
		
		
		kin= (x>y) ? (x>z ? "x is the greatest ":"z is the greatest") : (y>z ? "y is the greatest":"z is the greatest");
		System.out.println(kin);
		
				
	}

}
