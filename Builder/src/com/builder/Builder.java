package com.builder;

/**
 * 抽象建造类
 * @author Administrator
 *
 */
public abstract class Builder {
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract Product getResult();
}
