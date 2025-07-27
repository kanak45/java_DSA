package Functions1.DataDtructure;

public class arrayL {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;// -infinity or we can also write 0
        int smallest = Integer.MAX_VALUE;
         for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
            
         }
         System.out.println("smallest value is:" + smallest);
         return largest;
    }
    public static void main(String[] args) {
        int numbers[]= {2,6,5,8,7};
        System.out.println("largest value is:" + getLargest(numbers));
    }
}
