package com.chain;

/**
 * ����ʵ����
 * @author Administrator
 *
 */
public class MyHandler extends AbstrcatHandler implements Handler{
	
	private String name;

	/**
	 * ��ʼ������һ����������
	 * @param name
	 */
	public MyHandler(String name) {
		this.name = name;
	}

	@Override
	public void operation() {
		//�����������ʾ���ö�������ƣ�����ö����л�������һ���󣬼���������ʾ��������
		System.out.println(name+"handler");
		if(getHandler()!=null){
			getHandler().operation();
		}
	}
	
}
