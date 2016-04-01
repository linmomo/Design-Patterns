package com.adapteriml;

public class Test {
	public static void main(String[] args) {
		Warpper sourceSub1 = new SourceSub1();
		Warpper sourceSub2 = new SourceSub2();
		sourceSub1.method1();
		sourceSub1.method2();
		sourceSub2.method1();
		sourceSub2.method2();
	}
}
