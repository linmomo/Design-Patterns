package com.strategy;

/**
 * 抽象策略，传入需要处理的参数
 * @author Administrator
 *
 */
public interface IStrategy {
	public int calculate(String exp);
}
