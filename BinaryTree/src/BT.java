
public class BT {
    BTNode root;
    public BT(){
        root=null;
    }
    public void insert(int data){
        root=insert(root,data);
    }
    private BTNode insert(BTNode node,int data){
        if(node==null){
            node=new BTNode(data);
        }else{
            if(node.getLeft() == null){
                node.left=insert(node.left,data);
            }else{
                node.right=insert(node.right,data);
            }
        }
        return node;
    }
    public void inorder()
     {
         inorder(root);
     }
     private void inorder(BTNode r)
     {
         if (r != null)
         {
             inorder(r.getLeft());
             System.out.print(r.getData() +" ");
             inorder(r.getRight());
         }
     }
}
