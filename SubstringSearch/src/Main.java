import java.util.*;
public class Main {

    public static void main(String[] args) {
	    // write your code here
	    String s = "hello world";
	    String ss = "world";
	    HashMap<Character,StringBuilder> map =new HashMap<Character,StringBuilder>();
	    int i=0;
	    for(char c : s.toCharArray()){
	        if(!map.containsKey(c)){
	            map.put(c,new StringBuilder(i+""));
	        }else{
	            StringBuilder val = map.get(c);
	            val.append(i);
	            map.put(c,val);
	        }
	        i++;
	    }
	    int j=0,flag = 0;
	    for(char c:ss.toCharArray()){
	        if(map.containsKey(c)){
	            StringBuilder st = map.get(c);
	            System.out.println(j+" "+st);
	        }
	        j++;
	    }
    }
}
