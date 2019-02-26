package com.bdtech.java.construction;

public class DemoConstructor extends Constructor {
	// i am adding this comments to check.
	
	DemoConstructor(){
	
	}
	
	DemoConstructor(double a , double b){
		double c = a +b;
		System.out.println(c);
	}

	public DemoConstructor(String s ){
		System.out.println(s);
	 
   }

	public static void main(String[] args) {
		
		DemoConstructor dc = new DemoConstructor("hello");
		System.out.println(dc.add());
   }

}
