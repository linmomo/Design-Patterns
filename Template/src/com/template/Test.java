package com.template;

/**
 * ģ�巽�������㷨�ĹǼܣ������ʵ��ϸ�ڵ�����ʵ�֣�������Ҫ�����㣬ʵ�־��������
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		AbstractCalculate calculate=new Plus();
		int i = calculate.calculate("10+10", "\\+");
		System.out.println("i="+i);
	}
}
