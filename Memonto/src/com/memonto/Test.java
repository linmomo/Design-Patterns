package com.memonto;

public class Test {
	public static void main(String[] args) {
		//��ʼ��һ��Դ
		Original original=new Original("aaaaaa");
		
		//������ʵ�����浽��������
		Storage storage=new Storage(original.cteateMemonto());
		System.out.println("ԭ��="+original.getValue());
		//�ı�Դ�е�����
		original.setValue("bbbbbbb");
		System.out.println("����="+original.getValue());
		
		//ͨ�������ȡ�յı���ʵ�����лָ�����
		original.restorMemonto(storage.getMemonto());
		System.out.println("�ָ���="+original.getValue());
	}
}
