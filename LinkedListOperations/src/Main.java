public class Main {
       
    public static void main(String[] args) {
        Node obj = new Node();
         Node head = null;
//        n1.next = new Node(2);
//        n1.next.next = new Node(3);
//        System.out.println(n1);
          head=obj.insertEnd(2,head);
           head=obj.insertEnd(3,head);
            head=obj.insertEnd(4,head);
            head=obj.insertBegin(1,head);
            head=obj.insertBegin(0,head);
            head=obj.deleteNode(4,head);
            System.out.println(head);
    
    }
   
}

    

