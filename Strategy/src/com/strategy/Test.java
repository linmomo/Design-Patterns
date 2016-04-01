package com.strategy;

/**
 * 策略模式定义了一系列的算法，抽象来看，算法都是完成相同的工作，只是具体的实现不同
 * 根据需要的结果使用不同的策略 实现具体的类
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
