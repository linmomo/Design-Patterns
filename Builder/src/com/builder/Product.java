package com.builder;

import java.util.ArrayList;

/**
 * ��Ʒ��,��������Ĳ�Ʒ
 * @author Administrator
 *
 */
public class Product {
	
	private ArrayList<String> parts=new ArrayList<String>();
	
	public void add(String part){
		parts.add(part);
	}
	
	public void show(){
		System.out.println("��Ʒ����");
		for(String part:parts){
			System.out.println("-----"+part);
		}
	}
}
