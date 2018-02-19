import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void levelOrder(TreeNode localRoot){
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        TreeNode current=root;
        TreeNode parent=null;
        queue.add(current);
        while(!queue.isEmpty()){
            current=queue.poll();
            System.out.print(current.data+" ");
            if(current.left!=null){
                queue.offer(current.left);
            }if(current.right!=null){
                queue.offer(current.right);
            }
        }
    }

    public static void main(String[] args) {
    Tree tree=new Tree();
    tree.insertElement(10);
    tree.insertElement(12);
    tree.insertElement(1);
    tree.insertElement(11);
    tree.insertElement(14);
    tree.insertElement(15);
    tree.insertElement(2);
    tree.insertElement(9);
    tree.preOrder(tree.getRoot());
    tree.levelOrder(tree.getRoot());
        System.out.println("\nLeast common ancestor:");
        System.out.println(tree.lca(tree.getRoot(),new TreeNode(14),new TreeNode(15)));
        System.out.println("Height of the tree:"+tree.heightOfTree(tree.getRoot()));
    }

    public int heightOfTree(TreeNode localRoot){
        if(localRoot==null){
           return 0;
        }
        int leftHeight=heightOfTree(localRoot.left);
        int rightHeight=heightOfTree(localRoot.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public TreeNode lca(TreeNode localRoot,TreeNode n1,TreeNode n2){
        if(localRoot!=null) {
            if (localRoot.data > Math.max(n1.data, n2.data)) {
                return lca(localRoot.left, n1, n2);
            }
            if (localRoot.data < Math.min(n1.data, n2.data)) {
                return lca(localRoot.right, n1, n2);
            }
        }
        return localRoot;

    }

    public void preOrder(TreeNode localRoot){
        if(localRoot!=null){
            System.out.println(localRoot.data);
            preOrder(localRoot.left);
            preOrder(localRoot.right);
        }

    }
    public TreeNode findElement(int e){
        TreeNode current=root;
        while(current!=null) {
            if(e==current.data){
                return current;
            }
            else if (e < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }
    public void insertElement(int e) {
        TreeNode n=new TreeNode(e);
        if(root==null){
            root=n;
        }else{
            int l=0;
            TreeNode current = root;
            TreeNode parent = null;
            while(current!=null){
                l=0;
                parent=current;
                if(e<current.data){
                    current=current.left;
                    l=0;
                }   else{
                    current=current.right;
                    l=1;
                }
            }
            if(l==0){
                parent.left=n;
            }else{
                parent.right=n;
            }
        }
    }
}
