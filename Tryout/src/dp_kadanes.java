import java.util.*;
import java.io.*;
public class dp_kadanes {
    public static int maxSubArray(int[] arr,int length){
        int max_sofar=arr[0],curmax=arr[0];
        for(int i=0;i<length;i++){
          curmax = Math.max(arr[i],curmax+arr[i]);
          max_sofar = Math.max(curmax,max_sofar);
        }
        return max_sofar;
    }
    public static void main(String args[]){
        int[] arr={-10,-1,-2,-3,-4,-5};
       
        System.out.println(maxSubArray(arr,arr.length));
    }
}
