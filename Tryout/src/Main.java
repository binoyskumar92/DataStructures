import java.util.*;
public class Main {

   	public static int computeRoot(int mid,int a){
		if(mid==1){
		return 0;
		}
		if(mid*mid == a ){
			return mid;
		}else{
			return computeRoot(mid-1,a);
		}
	}
	public static int doStuff(int a){
		int	mid = a/2;
	    return computeRoot(mid,a);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		for(int i=0; i<n; i++){
			int a = in.nextInt();
			int result = doStuff(a);
			System.out.println(result);
		}
	}
    
}
