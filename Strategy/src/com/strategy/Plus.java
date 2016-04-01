package com.strategy;

/**
 * 加法的具体实现
 * @author Administrator
 *
 */
public class Plus extends AbstractCalculate implements IStrategy{

	@Override
	public int calculate(String exp) {
		int[] is = split(exp, "\\+");
		return is[0]+is[1];
	}


}
