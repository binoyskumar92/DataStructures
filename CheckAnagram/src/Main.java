import java.util.*;
public class Main {

    public static void main(String[] args) {
	    // write your code here
	    String s1="abc",s2="bca";
	    Main obj = new Main();
	    obj.checkAnagram(s1,s2);
    }
    public void checkAnagram(String s1, String s2){
        int flag = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        if(s1.length() != s2.length()){
            flag = 1;
        }
        for(char c : s1.toCharArray()){
            if(!map.containsKey(c)){
            map.put(c,1);
        }else{
            int val = map.get(c);
            val++;
            map.put(c,val);
        }
        }
        for( char c : s2.toCharArray()){
            if(map.containsKey(c)){
                int val = map.get(c);
                val--;
                map.put(c,val);
                
            }else{
                flag=1;
                break;
            }
        }
        //check if its anagram
        for(Character c : map.keySet()){
            if(map.get(c)!=0){
                flag = 1;
                break;
            }
        }
        String op = flag ==1?"Not Anagram":"Yes, it is an anagram";
System.out.println(op);
        
    }
}
