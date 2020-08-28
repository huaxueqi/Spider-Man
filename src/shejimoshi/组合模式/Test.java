package shejimoshi.组合模式;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode("A");
        TreeNode bNode = new TreeNode("B");
        TreeNode cNode = new TreeNode("C");
        TreeNode dNode = new TreeNode("D");
        rootNode.add(bNode);
        rootNode.add(cNode);
        cNode.add(dNode);
        Iterator<TreeNode> iterator = rootNode.getChildren();
        System.out.println(rootNode.getName());
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

       cNode.getChildren().forEachRemaining(l->{
           System.out.println(l.getName());
        });
    }
}