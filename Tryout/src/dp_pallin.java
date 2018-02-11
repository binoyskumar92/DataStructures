import java.util.*;
import java.io.*;
public class dp_pallin {
    public static int calcPallin(String s,int start,int len){
        char sc[] = new char[s.length()];
        int T[][]=new int[s.length()][s.length()];int j=0;
        for(int i=0;i<s.length();i++){
            T[i][i] = 1;
        }
        for(int l=2;l<=s.length();l++){
         for(int i=0;i<s.length()-l+1;i++){
             j = i+l-1;
           if(l==2 &&sc[i] == sc[j]){
           T[i][j] = 2;
           }else if(sc[i] == sc[j]){
              T[i][j] = 2+T[i+1][j-1];            
           }else{
               T[i][j] = Math.max(T[i][j-1],T[i+1][j]);
           }

         }
        }
        return T[0][s.length()-1];
    }
    public static void main(String args[]){
        String s="abba";
        System.out.println(calcPallin(s,0,s.length()));
    }
}
