package com.expression;

public class Test {
	public static void main(String[] args) {
		//创建一个源
		Context context=new Context(10, 20);
		//根据需要的操作获取不同的解释器
		Expression expression=new Plus();
		//操作获得结果
		int interpret = expression.interpret(context);
		System.out.println("result="+interpret);
	}
}
