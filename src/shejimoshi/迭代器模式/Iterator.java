package shejimoshi.迭代器模式;

public interface Iterator {
/**前移 */
 Object previous();

/**后移 */
 Object next();

/**判断是否有下一个元素 */
 boolean hasNext();
        }
