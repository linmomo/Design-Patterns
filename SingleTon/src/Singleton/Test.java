package Singleton;

public class Test {
	public static void main(String[] args) {
		SingleTonA singleTonA1=SingleTonA.getInstance();
		SingleTonA singleTonA2=SingleTonA.getInstance();
		if(singleTonA1==singleTonA2){
			System.out.println("singletonA1和singletonA2是一个对象");
		}else{
			System.out.println("singletonA1和singletonA2不是一个对象");
		}
		
		SingleTonB singleTonB1 = SingleTonB.getInstance();
		SingleTonB singleTonB2 = SingleTonB.getInstance();
		if(singleTonB1==singleTonB2){
			System.out.println("singleTonB1和singleTonB2是一个对象");
		}else{
			System.out.println("singleTonB1和singletonA2不是一个对象");
		}
	}
}
