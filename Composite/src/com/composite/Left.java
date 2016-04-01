package com.composite;

/**
 * Ҷ�ӽڵ㣬���ӽڵ�
 * @author Administrator
 *
 */
public class Left extends Component{

	public Left(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		System.out.println("����add");
	}

	@Override
	public void remove(Component component) {
		System.out.println("����remove");
	}

	@Override
	public void display(int depth) {
		System.out.println(getDepthStr(depth)+name);
	}

}
