import java.util.*;
public class Main {

    public static void main(String[] args) {
	     Node obj = new Node();
         Node head = null;
//        n1.next = new Node(2);
//        n1.next.next = new Node(3);
//        System.out.println(n1);
          head=obj.insertEnd(2,head);
           head=obj.insertEnd(2,head);
            head=obj.insertEnd(5,head);
            head=obj.insertBegin(1,head);
            head=obj.insertBegin(0,head);
            System.out.println(head);
            removeDuplicates(head);
    }
    public static void removeDuplicates(Node head){
        HashSet<Integer> set = new HashSet<Integer>();
        Node curr=head;
        while(curr!=null){
            set.add(curr.val);
            curr=curr.next;
        }
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
