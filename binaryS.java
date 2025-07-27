package Functions1.DataDtructure;

public class binaryS {
    public static int binaryS1(int numbers[], int key){
     int start = 0, end = numbers.length-1;
     while(start <= end){
        int mid = (start+end / 2);
        
        if(numbers[mid] == key){
            return mid;
        }
       if(numbers[mid] < key){ // right
            start = mid+1;
       } else {
        end = mid-1; //left
       }

     }
     return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 14;

        System.out.print("index of numbers is : " + binaryS1(numbers,key));
    }
}
