package com.state;

/**
 * ����״̬����1
 * @author Administrator
 *
 */
public class ConcreteState1 implements IState{

	@Override
	public void handler(Context context) {
		System.out.println("״̬1");
		//����ʱ���ı�״̬Ϊ1֮�󣬽�״̬ʵ���滻Ϊ2
		context.setState(new ConcreteState2());
	}
	
}
