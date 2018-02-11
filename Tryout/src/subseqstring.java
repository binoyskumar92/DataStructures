import java.io.*;
import java.util.*;
public class subseqstring {
    public static void main(String args[]){
        String s = "altanta";
           int i = 0, j = 0, max = 0,k=1;
    Set<Character> set = new HashSet<>();
    
    while (j < s.length()) {
        System.out.println("Iter : "+k++);
        if (!set.contains(s.charAt(j))) {
             System.out.println("Element added:"+s.charAt(j));
            set.add(s.charAt(j++));
            max = Math.max(max, set.size());
        } else {
            System.out.println("Element removed:"+s.charAt(i));
            set.remove(s.charAt(i++));
        }
    }

   }

}
