package Singleton;

/**
 * ����ʽ����ģʽ,һ�����ʵ��������
 * @author Administrator
 *
 */
public class SingleTonA {
	private static SingleTonA instance=new SingleTonA();
	
	private SingleTonA() {}
	
	public static SingleTonA getInstance(){
		return instance;
	}
}
