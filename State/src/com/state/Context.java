package com.state;

/**
 * 原始操作类，持有状态类实例
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
