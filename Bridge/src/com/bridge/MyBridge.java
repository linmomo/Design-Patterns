package com.bridge;

/**
 * ����Դ����ʵ�����������ʵ�ֺ;���ʵ��
 * @author Administrator
 *
 */
public abstract class MyBridge {
	
	public Sourceable sourceable;
	
	public abstract void method();

	public void setSourceable(Sourceable sourceable) {
		this.sourceable = sourceable;
	}
}
