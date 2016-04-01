package com.iterator;

/**
 * 定义一些迭代操作
 * @author Administrator
 *
 */
public interface Iterator {
	/**前移 */
	Object previous();
	/**后移 */
	Object next();
	/**是否存在下一個 */
	boolean hashNext();
	/**獲取第一個元素 */
	Object first();
	
}
