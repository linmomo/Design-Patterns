package com.state;

/**
 * ����״̬����2
 * @author Administrator
 *
 */
public class ConcreteState2 implements IState{

	@Override
	public void handler(Context context) {
		System.out.println("״̬2");
		context.setState(new ConcreteState1());
	}

}
