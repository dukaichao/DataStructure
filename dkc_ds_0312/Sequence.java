package dkc_ds_0312;
/**
 * 线性表规范
 * @author dell
 *
 */
public interface Sequence {
	
	/**
	 * 向线性表中添加元素
	 * @param date   要存储的元素
	 */
	void add(Object data);
	
	/**
	 * 线性表中删除元素
	 * @param index   要删除的元素下标
	 * @return  是否删除成功
	 */
	boolean remove(int index);
	
	/**
	 * 在线性表中查找指定下标的元素
	 * @param index   要查找的索引
	 * @return
	 */
	Object get(int index);
	
	/**
	 * 判断线性表中是否有指定元素
	 * @param data   要查找的元素内容
	 * @return
	 */
	boolean contains(Object data);
	
	/**
	 * 修改线性表中指定索引的内容
	 * @param index   要修改元素下标
	 * @param newData  修改后的内容
	 * @return
	 */
	Object set(int index,Object newData);
	
	/**
	 * 返回当前线性表的长度
	 * @return
	 */
	int size();
	
	/**
	 * 清空线性表内容
	 */
	void clear();
	
	/**
	 * 将线性表转为数组
	 * @return
	 */
	Object[] toArray();
}
