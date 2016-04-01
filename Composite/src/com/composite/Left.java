package com.composite;

/**
 * 叶子节点，无子节点
 * @author Administrator
 *
 */
public class Left extends Component{

	public Left(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		System.out.println("不能add");
	}

	@Override
	public void remove(Component component) {
		System.out.println("不能remove");
	}

	@Override
	public void display(int depth) {
		System.out.println(getDepthStr(depth)+name);
	}

}
