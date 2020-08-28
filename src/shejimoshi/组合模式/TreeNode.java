package shejimoshi.组合模式;

import java.util.ArrayList;
import java.util.Iterator;

public class TreeNode {
    /**节点名称 */
    private String name;
    private TreeNode parent;
    private ArrayList<TreeNode> children = new ArrayList<TreeNode>();

    public TreeNode(String name) {
        this.name = name;
    }

    /**
     * 对相关属性进行封装
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    /**
     * 对孩子节点的增删查操作
     */
    public void add(TreeNode node) {
        children.add(node);
    }

    public void delete(TreeNode node) {
        children.add(node);
    }

    public Iterator<TreeNode> getChildren() {
        return children.iterator();
    }

}
