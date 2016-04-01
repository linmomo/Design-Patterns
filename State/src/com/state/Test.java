package com.state;

public class Test {
	public static void main(String[] args) {
		//状态实例1
		IState state=new ConcreteState1();
		//上下文中持有该状态实例
		Context context=new Context(state);
		
		//具体执行时，1 2状态互相改变，改变1之后就持有2
		context.requset();
		context.requset();
		context.requset();
		context.requset();
	}
}
