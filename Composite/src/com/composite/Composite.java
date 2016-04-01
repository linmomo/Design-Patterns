package com.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 子节点
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
		//根据当前层次显示-数量 之后继续遍历子节点继续显示，相应增加一个-数量，表示层次
		System.out.println(getDepthStr(depth)+name);
		for (Component component:list) {
			component.display(depth+1);
		}
	}

}
