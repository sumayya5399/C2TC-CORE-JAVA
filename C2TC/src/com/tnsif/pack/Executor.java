package com.tnsif.pack;

public class Executor {
	
//have main method. in this we use Base prog
	public static void main(String[] args) {
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
	//b1.varPrivate; can't access private access specifier 	
		b1.varDefault=1;
		b1.methodDefault();
	}
}
