
public class lcs {
    public static int lcs(char[] s1,char[] s2,int l1,int l2){
        if(l1==0 || l2==0){
            return 0;
        }
        else if(s1[l1-1] == s2[l2-1]){
            return 1+lcs(s1,s2,l1-1,l2-1);
        }

            else{
                return Math.max(lcs(s1,s2,l1-1,l2),lcs(s1,s2,l1,l2-1));
            }
    }
    public static void main(String args[]){
       String s1="XYNCDANMC",s2="NGHCAJHNDJMIC";
       System.out.println("LCS : "+lcs(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length()));
        
    }
}
