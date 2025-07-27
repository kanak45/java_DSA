package Functions1.DataDtructure;
import java.util.Scanner;
public class array {
    // public static void main(String[] args) {
    //     int marks[] = new int[50];
    //     int num[] = {1,2,3,};
    //     String name[] = {"apple", "Banana", "guavava"};
    //     System.out.println(num);
    // } 
    public static void main(String args []){
        int marks [] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array numbers:");
         marks[0] = sc.nextInt();
         marks[1] = sc.nextInt();
         marks[2] = sc.nextInt();
         System.out.println("physics: "+marks[0]);
         System.out.println("Chemistry: "+marks[1]);
         System.out.println("Mathematics: "+marks[3]);

         marks[2] = marks[2] +2;
         System.out.println("math: "+marks[2]);

         int average = ((marks[0]+marks[2]+marks[1])/3);
         System.out.println("Average =" +average + "%");

         System.out.println("length of array:" + marks.length);
    }
}
