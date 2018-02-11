import java.util.*;
public class Main {

    public static void main(String[] args) {
	    // write your code here
	    int flag=0;
	  
	    String s ="Hello World";
	    HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	    for(char c : s.toCharArray()){
	        if(!map.containsKey(c)){
	          map.put(c,1);  
	        }else{
	            flag =1;
	            int val = map.get(c);
	            val++;
	            map.put(c,val);
	            //break;
	        }
	        
	    }
	    String op= flag==1?"Not unique character":"Unique characters";
	    System.out.println(op);
	   
	    //printing the hashmap values
	     System.out.println(map);
    }
}
