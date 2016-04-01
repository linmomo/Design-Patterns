package Singleton;

/**
 * ¿¡∫∫ Ω£¨—”≥Ÿº”‘ÿ
 * @author Administrator
 *
 */
public class SingleTonB {
	private static SingleTonB instance=null;
	
	private SingleTonB() {}
	
	public static SingleTonB getInstance(){
		if(instance==null){
			instance=new SingleTonB();
		}
		return instance;
	}
	
}
