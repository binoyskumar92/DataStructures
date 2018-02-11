public class Main {

    public static void main(String[] args) {
	     Node obj = new Node();
         Node head = null;

          head=obj.insertEnd(2,head);
           head=obj.insertEnd(3,head);
            head=obj.insertEnd(5,head);
            head=obj.insertBegin(1,head);
            head=obj.insertBegin(0,head);
            System.out.println(head);
            deleteMiddleElement(head);
            System.out.println(head);
    }
    public static void deleteMiddleElement(Node head){
        Node curr = head;
        int iter=1;
        while(curr.next!=null){
            curr = curr.next;
            iter++;
        }
        //find middle
        int middle=0;
        if(iter%2 ==1 ){
            middle = (iter/2) + 1;
        }else{
            middle = iter/2;
        }
        //remove middle element
        int i=1;
        curr=head;
        while(i<middle-1){
        curr=curr.next; 

        i++;
        }
        curr.next=curr.next.next;        
         
    }
}
