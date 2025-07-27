package Functions1.DataDtructure;

public class printpairs {
public static void printPairs(int numbers[]){
    int tp = 0;
    for(int i = 0; i<numbers.length; i++){
        int curr = numbers[i];//2 4 6 8 10
        for(int j=i+1; j<numbers.length; j++){
          System.out.print("("+ curr + "," + numbers[j] + ")");
          tp++;
        }
           System.out.println();
    }
     System.out.println("Total Pairs:" + tp);
  }
            public static void main(String args[]){
                int numbers[] = {2,4,6,8,10,12,14};
                printPairs(numbers);
            }   
}

//tp = n(n-1)/2 Arithmatic operation sum of n number
//Time complexity = O(n^2)-> Nested loop
//worst case -> O(n)
