package Functions1;

public class prime {
    public static boolean isPrime(int n){
        //Only for 2
        //Corner case
        if(n == 2){
            return true;
        }
      //boolean  isPrime = true;
      // optimized for(int i=2; ii<=math.sqrt(n); i++)
       for(int i = 2;  i <=n-1; i++){
        if (n % i == 0){
            // isPrime = false;
            // break;
            return false;
        }
       }
        // return isPrime;
        return true;
    }


    public static void primesInRange(int n){
        for(int i = 2; i<=n; i++){
           if( isPrime(i)){
            System.out.println(i+" ");
           }
        }
        System.out.println();
    }
    public static void main (String args[]){
      // System.out.println(isPrime(16)) ;
      primesInRange(20);
    }
}
