package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ����������֪ͨ�ߣ�����۲���ʵ�����й۲�
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
	 * ֪ͨ���еĹ۲��߸���
	 */
	public void notifyAllObserver(){
		for (Observer ob : list) {
			ob.update();
		}
	}
 }
