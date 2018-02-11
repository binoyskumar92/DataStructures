/* Edits  - insert,remove or replace a character*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
	    // write your code here
	    String s = "Jail",edit="tail";
	    int flag = 0;
	    HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	    for(char c : s.toCharArray()){
	        map.put(c,1);
	    }
	    int count = 0,edited=0;
	    if(s.length()==edit.length() || edit.length()==s.length()-1 || edit.length()==s.length()+1)
	    {
	        if(edit.length()==s.length()-1 || edit.length()==s.length()+1){
	            edited++;
	        }
	        //count helps in noting how many chars are missed and edited for delte or add operation
	    for(char c:edit.toCharArray()){
	        if(!map.containsKey(c)){
	            count++;
	            if(count>1 || edited>0){
	            flag =1;
	            edited++;
            }

	        }
	    }
    }else{
        flag =1;
    }
   String op = flag ==1 && edited>1?"False : Not 1 edited":"True : Edited 1";
   System.out.println(op);
    }
}
