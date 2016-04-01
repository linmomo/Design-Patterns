package com.expression;

/**
 * 解释器抽象，持有操作实例
 * @author Administrator
 *
 */
public interface Expression {
	int interpret(Context context);
}
