package com.composite;

/**
 * 组合对象抽象类
 * @author Administrator
 *
 */
public abstract class Component {
	
	protected String name;

	public Component(String name) {
		this.name = name;
	}
	
	/**
	 *添加子节点
	 * @param component
	 */
	public abstract void add(Component component);
	
	/**
	 * 移除子节点
	 * @param component
	 */
	public abstract void remove(Component component);
	
	/**
	 * 显示组合结果
	 * @param depth
	 */
	public abstract void display(int depth);
	
	/**
	 * 根据当前节点层次标注对应-
	 * @param depth
	 * @return
	 */
	public String getDepthStr(int depth){
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<depth;i++){
			builder.append("-");
		}
		return builder.toString();
	}
}
