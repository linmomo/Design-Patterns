package com.proxy;

/**
 * �����࣬ʵ�ֻ������ܽӿڣ����о���ʵ��ʵ������ʵ�ֹ���
 * @author Administrator
 *
 */
public class Proxy implements ISubject{
	
	private Subject subject;

	@Override
	public void request() {
		System.out.println("����ʼ");
		if(subject==null){
			subject = new Subject();
		}
		subject.request();
		System.out.println("�������");
	}

}
