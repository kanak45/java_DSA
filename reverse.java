package Functions1.DataDtructure;

public class reverse {
    public static void reverse1(int numbers[]){
      int first = 0, last = numbers.length-1;

      while(first < last){
        //swap
        int temp = numbers[last];
        numbers[last] = numbers[first];
        numbers[first] = temp;

        first++;
        last--;
      }
    }
    public static void main(String[] args) {
        int numbers[] = {2,1,3,5,8};
        reverse1(numbers);
        //array print
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
         System.out.println();
    }
}
