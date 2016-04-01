package com.state;

/**
 * 具体状态操作1
 * @author Administrator
 *
 */
public class ConcreteState1 implements IState{

	@Override
	public void handler(Context context) {
		System.out.println("状态1");
		//操作时，改变状态为1之后，将状态实例替换为2
		context.setState(new ConcreteState2());
	}
	
}
