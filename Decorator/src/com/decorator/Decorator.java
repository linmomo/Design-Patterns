package com.decorator;

/**
 * װ�����࣬���б�װ����ʵ��
 * @author Administrator
 *
 */
public class Decorator implements Sourceable{

	private Source source;

	public Decorator(Source source) {
		this.source = source;
	}
	
	@Override
	public void method1() {
		if(source!=null){
			source.method1();
		}
	}

}
