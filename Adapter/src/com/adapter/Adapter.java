package com.adapter;

/**
 * 类的适配模式
 * @author Administrator
 *
 */
public class Adapter extends Source implements Targetable{
	
	@Override
	public void mehthod2() {
		System.out.println("this adapter method");
	}

}
