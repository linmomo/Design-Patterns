package com.chain;

/**
 * ����ͬ�Ĵ�ȡ����ķ���
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
