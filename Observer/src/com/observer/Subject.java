package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的主题或通知者，引入观察者实例进行观察
 * @author Administrator
 *
 */
public abstract class Subject {
	List<Observer> list=new ArrayList<Observer>();
	
	public void add(Observer observer){
		list.add(observer);
	}
	
	public void remove(Observer observer){
		list.remove(observer);
	}
	
	/**
	 * 通知所有的观察者更新
	 */
	public void notifyAllObserver(){
		for (Observer ob : list) {
			ob.update();
		}
	}
 }
