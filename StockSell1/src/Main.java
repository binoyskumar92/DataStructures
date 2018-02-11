/* Find maximum profit by selling stocks with maximum of one transaction.
minPrice = math.min(minP,arr[i])
currProfit = Math.max(currp,arr[i]-minP)
*/
public class Main {

    public static void main(String[] args) {
	    // write your code here
    int[] arr = {100, 80, 120, 130, 70, 60, 100, 125};
    int minP = Integer.MAX_VALUE;
    int i=0,currP=0;;
    
    while(i<arr.length){
       // System.out.println(arr[i]+" - "+i);
       if(minP>arr[i]){
           minP=arr[i];
       }
       if(currP<(arr[i]-minP)){
           currP = arr[i]-minP;
          // System.out.println("i+1 "+arr[i+1]);
       }
        i++;
    }
    
            System.out.println("Profit = "+currP);
    }
}
