package com.state;

/**
 * ԭʼ�����࣬����״̬��ʵ��
 * @author Administrator
 *
 */
public class Context {
	
	private IState state;

	public IState getState() {
		return state;
	}

	public void setState(IState state) {
		this.state = state;
	}

	public Context(IState state) {
		this.state = state;
	}
	
	public void requset(){
		state.handler(this);
	}
}
