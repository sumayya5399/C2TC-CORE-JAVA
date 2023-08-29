package com.tnsif.pack;
//no main method in this prog.we use this prog in executor prog
public class Base {
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=20;
	
	//methods,behaviour
void methodDefault()
{
	System.out.println("Default access Base Class");
	System.out.println(varDefault);
}
public void methodPublic()
{
	System.out.println("Public access Base Class");
	System.out.println(varPublic);
}
private void methodPrivate()
{
	System.out.println("private access Base Class");
	System.out.println(varPrivate);
}
protected void methodProtected()
{
	System.out.println("Protected access Base Class");
	System.out.println(varProtected);
}


}
