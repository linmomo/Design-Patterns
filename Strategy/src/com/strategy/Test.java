package com.strategy;

/**
 * ����ģʽ������һϵ�е��㷨�������������㷨���������ͬ�Ĺ�����ֻ�Ǿ����ʵ�ֲ�ͬ
 * ������Ҫ�Ľ��ʹ�ò�ͬ�Ĳ��� ʵ�־������
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		IStrategy iStrategy=new Plus();
		int calculate = iStrategy.calculate("2+9");
		System.out.println(""+calculate);
	}
}
