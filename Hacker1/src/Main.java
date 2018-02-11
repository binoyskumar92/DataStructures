import java.util.*;
public class Main {
    

   static String super_reduced_string(String s){
        String abc;
        abc=check(s);
        return abc;
    }
    public static String check(String s){
        StringBuilder st= new StringBuilder("");
        int i=0,flag=0;
    while(i<s.length()){
        if(i+1<s.length()){
            if(s.charAt(i)==s.charAt(i+1)){
                i=i+2;
                flag=1;
            }else{
                st.append(s.charAt(i)); 
                i++;
            }
        }else{
            st.append(s.charAt(s.length()-1));
            i++;
        }
    }
        if(flag==1){
          check(st.toString());
    }
        if(st.toString().equals("")){
            st.append("Empty String");
        }
         return st.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
