package Singleton;

/**
 * 饿汉式单例模式,一进入就实例化对象
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
