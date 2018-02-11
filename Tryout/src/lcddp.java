
public class lcddp {
       public static int lcs(char[] s1,char[] s2,int l1,int l2){
           int L[][]=new int[l1+1][l2+1];
     for(int i=0;i<=l1;i++){
         for(int j=0;j<=l2;j++){
             if(i==0 || j==0){
                 L[i][j] = 0;
             }else if(s1[i-1] == s2[j-1]){
                 L[i][j] = 1 +  L[i-1][j-1];
             }else{
                 L[i][j] = Math.max(L[i][j-1],L[i-1][j]);
             }
         }
     }
     return L[l1][l2];
    }
      public static void main(String args[]){
       String s1="XYNCDANMC",s2="NGHCAJHNDJMIC";
       System.out.println("LCS : "+lcs(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length()));
        
    }
}
