package com.builder;

/**
 * ����Ľ�����2
 * @author Administrator
 *
 */
public class ConcreteBuilder2 extends Builder {
	
	//����������ʵ��
	private Product product=new Product();

	@Override
	public void buildPartA() {
		product.add("���x");
	}

	@Override
	public void buildPartB() {
		product.add("���Y");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
