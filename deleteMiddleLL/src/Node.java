public class Node{
        Node next;
        int val;
        public Node(int val){
            this.next = null;
            this.val = val;
        }
        public Node(){
            
        }
         public Node insertEnd(int val,Node head){
        if(head==null){
            head = new Node(val);
        }else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=new Node(val);
            
        }
        return head;
    }
    public Node insertBegin(int val,Node head){
        if(head==null){
            head=new Node(val);
        }
        else{
            Node curr=head;
            head = new Node(val);
            head.next=curr;
        }
    return head;
    }
    
    public Node deleteNode(int val,Node head){
        if(head!=null){
         if(head.val == val){
         head = head.next;
     }else{
     Node prev=head,curr = head.next;
    
     while(curr!=null){        
         if(curr.val==val){
             prev.next = prev.next.next;
         }
         prev=prev.next;
         curr=curr.next;
     }
    }
    }
    return head;
}
        public String toString(){
            Node n = this;
            StringBuilder st=new StringBuilder("");
            while(n!=null){
               st.append(n.val+" -> ");
               n=n.next;
            }
            return st.toString();
        }
    }