package com.simplefactory;

/**
 * 简单工厂
 * @author Administrator
 *
 */
public class SimpleFactory {
	/**
	 * 根据参数选择使用何种算法
	 * @param parms
	 * @return
	 */
	public Operation createOperation(char parms){
		switch (parms) {
		case '+':
			return new AddOperation();
		case '-':
			return new SubOperation();
		default:
			try {
				throw new Exception("找不到和"+parms+"相匹配的运算符");
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		return null;
	};
}
