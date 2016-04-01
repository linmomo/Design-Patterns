package com.template;

/**
 * һ�������㷨��ģ�壬��ȡ����
 * @author Administrator
 *
 */
public abstract class AbstractCalculate {
	
	public int[] split(String exp,String opt){
		String[] arrayString = exp.split(opt);
		int[] arrayInt=new int[2];
		arrayInt[0]=Integer.valueOf(arrayString[0]);
		arrayInt[1]=Integer.valueOf(arrayString[1]);
		return arrayInt;
	}
	
	public int calculate(String exp,String opt){
		int[] split = split(exp, opt);
		return calculate(split[0], split[1]);
	}
	
	public abstract int calculate(int num1 , int num2);
}
