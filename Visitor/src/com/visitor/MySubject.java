package com.visitor;

/**
 * ����ʵ�ֱ�������
 * @author Administrator
 *
 */
public class MySubject implements ISubject{

	@Override
	public String getSubject() {
		return "������";
	}

	@Override
	public void accept(IVisitor visitor) {
		//ͬ�ⱻ���ʣ��÷����߳��б�����ʵ�������������еĲ���
		visitor.visitor(this);
	}

}
