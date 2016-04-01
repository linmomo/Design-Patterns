package com.chain;

/**
 * 抽象共同的存取对象的方法
 * @author Administrator
 *
 */
public abstract class AbstrcatHandler {
	private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}
