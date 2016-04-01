package com.composite;

/**
 * ��϶��������
 * @author Administrator
 *
 */
public abstract class Component {
	
	protected String name;

	public Component(String name) {
		this.name = name;
	}
	
	/**
	 *����ӽڵ�
	 * @param component
	 */
	public abstract void add(Component component);
	
	/**
	 * �Ƴ��ӽڵ�
	 * @param component
	 */
	public abstract void remove(Component component);
	
	/**
	 * ��ʾ��Ͻ��
	 * @param depth
	 */
	public abstract void display(int depth);
	
	/**
	 * ���ݵ�ǰ�ڵ��α�ע��Ӧ-
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
