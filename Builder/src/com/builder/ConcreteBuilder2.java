package com.builder;

/**
 * 具体的建造类2
 * @author Administrator
 *
 */
public class ConcreteBuilder2 extends Builder {
	
	//持有生产的实例
	private Product product=new Product();

	@Override
	public void buildPartA() {
		product.add("组件x");
	}

	@Override
	public void buildPartB() {
		product.add("组件Y");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
