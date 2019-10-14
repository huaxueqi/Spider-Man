package 剑指;

import java.util.ArrayList;
import java.util.Stack;

      class ListNode <T>{
          T val;
          ListNode next ;
        public ListNode(T val) {
            this.val = val;
        }

          public ListNode() {

          }

          void add(T data){
             if(this.next == null){
                 this.next= new ListNode(data);
             }else {
                 this.next.add(data);
             }
        }
    }
public class three {
        ArrayList<Integer> arrayList1=new ArrayList<>();
    public static void main(String[] args) {
          ListNode <Integer> listNode =new ListNode<Integer>();
          listNode.add(1);
          listNode.add(2);
         ListNode node1= new ListNode(1);
         ListNode node2= new ListNode(2);
         ListNode node3= new ListNode(3);
          node1.next=node2;
          node2.next=node3;
        three.solution(node1).forEach(l->{
            System.out.println(l);
        });
        three three=new three();
         System.out.println(three.solution1(node1));
    }
        public static ArrayList<Integer> solution (ListNode listNode){
            ArrayList<Integer> arrayList=new ArrayList<>();
            Stack<ListNode> stack =new Stack<>();
            while(listNode != null){
                //if(listNode.val != null)
                stack.push(listNode);
                listNode=listNode.next;
            }
            while(!stack.isEmpty()){
                arrayList.add((Integer) stack.pop().val);
            }
            return arrayList;
        }
       public  ArrayList<Integer> solution1 (ListNode listNode){
        if(listNode != null){
         solution1(listNode.next);
         //if(listNode.val != null)
         arrayList1.add((Integer) listNode.val);
       }

        return arrayList1;
    }
    }

