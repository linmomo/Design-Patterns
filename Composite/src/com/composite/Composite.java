package com.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * �ӽڵ�
 * @author Administrator
 *
 */
public class Composite extends Component{
	
	private List<Component> list=new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		list.add(component);
	}

	@Override
	public void remove(Component component) {
		list.remove(component);
	}

	@Override
	public void display(int depth) {
		//���ݵ�ǰ�����ʾ-���� ֮����������ӽڵ������ʾ����Ӧ����һ��-��������ʾ���
		System.out.println(getDepthStr(depth)+name);
		for (Component component:list) {
			component.display(depth+1);
		}
	}

}
