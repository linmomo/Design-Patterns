package com.strategy;

/**
 * 辅助类,实现将需要运算的参数拆分并得到两个运算参数
 * @author Administrator
 *
 */
public class AbstractCalculate {
	public int[] split(String exp,String opt){
		String array[] = exp.split(opt);
		int arrayInt[]=new int[2];
		arrayInt[0] = Integer.valueOf(array[0]);
		arrayInt[1]= Integer.valueOf(array[1]);
		return arrayInt;
	}
}
