package com.adapter;

/**
 * �������ģʽ
 * @author Administrator
 *
 */
public class Adapter extends Source implements Targetable{
	
	@Override
	public void mehthod2() {
		System.out.println("this adapter method");
	}

}
