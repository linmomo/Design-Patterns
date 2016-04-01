package com.prototype;

public class ConcreteProperty implements Propetype {
	
	public String name="tag";
	public int age=0;
	
	public ConcreteProperty(String tag) {
		name=tag;
	}

	@Override
	public ConcreteProperty clones() {
		ConcreteProperty concreteProperty=new ConcreteProperty(this.name);
		concreteProperty.age=this.age;
		return concreteProperty;
	}

}
