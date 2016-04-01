package com.builder;

public class Test {
	public static void main(String[] args) {
		
		Builder buidler;
		Product result ;
		
		Director director=new Director();
		
		buidler=new ConcreteBuidler1();
		director.construct(buidler);
		result = buidler.getResult();
		result.show();
		
		buidler=new ConcreteBuilder2();
		director.construct(buidler);
		result = buidler.getResult();
		result.show();
	}
}
