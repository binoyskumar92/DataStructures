import java.util.*;
import java.io.*;
public class kadanes {
    public static int maxSubArray(int[] arr,int length){
        int max_sofar=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<length;i++){
            sum = sum + arr[i];
            if(sum>max_sofar){
               max_sofar = sum;
            }if(sum<0){
                sum = 0;
            }

        }
        return max_sofar;
    }
    public static void main(String args[]){
        int[] arr={-10,-1,-2,-3,-4,-5};
        System.out.println(maxSubArray(arr,arr.length));
    }
}
