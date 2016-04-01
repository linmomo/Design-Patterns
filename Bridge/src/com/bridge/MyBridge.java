package com.bridge;

/**
 * 持有源方法实例，分离抽象实现和具体实现
 * @author Administrator
 *
 */
public abstract class MyBridge {
	
	public Sourceable sourceable;
	
	public abstract void method();

	public void setSourceable(Sourceable sourceable) {
		this.sourceable = sourceable;
	}
}
