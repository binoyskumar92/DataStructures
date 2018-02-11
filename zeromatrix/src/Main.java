import java.util.*;
public class Main {

    public static void main(String[] args) {
	    // write your code here
        int m=0,n=0;
        Scanner in = new Scanner(System.in);
        m=in.nextInt();
        in.nextLine();
        n=in.nextInt();
        int[][] mat = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=in.nextInt();
            }
            in.nextLine();
        }
        showMatrix(mat,m,n);
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0){
                 for(int l=0;l<m;l++){
                 mat[l][j]=0;
                 System.out.println("i="+l+"j="+j+mat[l][j]);
             }
             for(int k=0;k<n;k++){
                 mat[i][k]=0;
                 System.out.println("i="+i+"j="+k+mat[i][k]);
             }

            }
         
        }
        }
        showMatrix(mat,m,n);
    }
    public static void showMatrix(int[][] mat,int m, int n){
        System.out.println("");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
    }
}
