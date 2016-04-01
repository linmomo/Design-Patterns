package com.builder;

/**
 * 具体的建造类1
 * @author Administrator
 *
 */
public class ConcreteBuidler1 extends Builder{
	
	private Product product=new Product();

	@Override
	public void buildPartA() {
		product.add("组件A");
	}

	@Override
	public void buildPartB() {
		product.add("组件B");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
