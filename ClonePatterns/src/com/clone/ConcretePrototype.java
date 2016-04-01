package com.clone;

public class ConcretePrototype implements Prototype{
	
	public String tag="Tag";
	public int age=0;

	public ConcretePrototype(String tag) {
		this.tag = tag;
	}

	@Override
	public Object clones() {
		ConcretePrototype concretePrototype=new ConcretePrototype(this.tag);
		concretePrototype.age=this.age;
		return concretePrototype;
	}
}
