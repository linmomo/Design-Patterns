package com.simplefactory;

/**
 * �򵥹���
 * @author Administrator
 *
 */
public class SimpleFactory {
	/**
	 * ���ݲ���ѡ��ʹ�ú����㷨
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
				throw new Exception("�Ҳ�����"+parms+"��ƥ��������");
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		return null;
	};
}
