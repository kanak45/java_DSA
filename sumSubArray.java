package Functions1.DataDtructure;
public class sumSubArray {
    public static void maxsubArraysum(int a[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0; i<a.length; i++){
            int start = i;
            for(int j = i; j<a.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += a[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum; 
                }
            }
        }
        System.out.println("max sum = "+ maxSum);
    }
    public static void main(String args[]){
        int a[] = {2,-4,6,-8,10};
        maxsubArraysum(a);
    }
}
//time complexity O(n^3)