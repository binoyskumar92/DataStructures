
public class BTNode {
BTNode left,right;
int data;

public BTNode(){
    left=null;
    right=null;
    data=0;
}
public BTNode(int e){
    left=null;
    right=null;
    data=e;
}
public void setLeft(BTNode node){
    left=node;
}
public BTNode getLeft(){
    return left;
}
public void setRight(BTNode node){
    right=node;
}
public BTNode getRight(){
    return right;
}
public void setData(int e){
    data=e;
}
public int getData(){
    return data;
}

}
