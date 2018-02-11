
public class binomialcoeff {
    

    public static int compute(int n,int k){
         if(k==0 || k==n){
            return 1;
        }

        else{
        return compute(n-1,k-1) + compute(n-1,k);
    }

    }
    public static void main(String args[]){
        int n=2,k=1;
        System.out.println(compute(n,k)+ " ");
    }
}
