package com.builder;

/**
 * 指挥者，指挥建造类组装产品
 * @author Administrator
 *
 */
public class Director {
	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
