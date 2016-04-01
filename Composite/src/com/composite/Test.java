package com.composite;

public class Test {
	public static void main(String[] args) {
		Composite root=new Composite("root");
		root.add(new Left("Left A"));
		root.add(new Left("Left B"));
		
		Composite composite1=new Composite("composite X");
		composite1.add(new Left("Left XA"));
		composite1.add(new Left("Left XB"));
		
		root.add(composite1);
		
		Composite composite2=new Composite("composite Y");
		composite2.add(new Left("Left YA"));
		composite2.add(new Left("Left YB"));
		
		root.add(composite2);
		
		root.add(new Left("Left C"));
		
		Left left=new Left("D");
		root.add(left);
		root.remove(left);
		
		root.display(1);
	}
}
