package com.memonto;

public class Test {
	public static void main(String[] args) {
		//初始化一个源
		Original original=new Original("aaaaaa");
		
		//将备份实例保存到储存类中
		Storage storage=new Storage(original.cteateMemonto());
		System.out.println("原来="+original.getValue());
		//改变源中的数据
		original.setValue("bbbbbbb");
		System.out.println("后来="+original.getValue());
		
		//通过储存获取刚的备份实例进行恢复操作
		original.restorMemonto(storage.getMemonto());
		System.out.println("恢复的="+original.getValue());
	}
}
