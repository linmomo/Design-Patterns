package com.template;

/**
 * 模板方法定义算法的骨架，具体的实现细节到子类实现，根据需要的运算，实现具体的子类
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
