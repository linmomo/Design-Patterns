package com.builder;

/**
 * ����Ľ�����1
 * @author Administrator
 *
 */
public class ConcreteBuidler1 extends Builder{
	
	private Product product=new Product();

	@Override
	public void buildPartA() {
		product.add("���A");
	}

	@Override
	public void buildPartB() {
		product.add("���B");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
