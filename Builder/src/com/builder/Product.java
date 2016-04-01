package com.builder;

import java.util.ArrayList;

/**
 * 产品类,生产具体的产品
 * @author Administrator
 *
 */
public class Product {
	
	private ArrayList<String> parts=new ArrayList<String>();
	
	public void add(String part){
		parts.add(part);
	}
	
	public void show(){
		System.out.println("产品创建");
		for(String part:parts){
			System.out.println("-----"+part);
		}
	}
}
