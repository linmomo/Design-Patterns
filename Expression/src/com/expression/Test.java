package com.expression;

public class Test {
	public static void main(String[] args) {
		//����һ��Դ
		Context context=new Context(10, 20);
		//������Ҫ�Ĳ�����ȡ��ͬ�Ľ�����
		Expression expression=new Plus();
		//������ý��
		int interpret = expression.interpret(context);
		System.out.println("result="+interpret);
	}
}
