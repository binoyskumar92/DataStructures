public class Test {
   public static void main(String args[]) {
      int n=9;
      int f[]=new int[n];
      f[0]=0;
      f[1]=1;
      for(int i=2;i<n;i++){
          f[i]=f[i-1]+f[i-2];
          if(i==n-1){
              System.out.println(f[n-1]);
          }
      }
    }
}
