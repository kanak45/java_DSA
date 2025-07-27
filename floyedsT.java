package Functions1;

public class floyedsT {
    public static void floyeds_triangle(int n){
        //outer
        int counter=1;
        for(int i=1; i<=n; i++){
            //inner- how many times will counter be printed
            for(int j=1; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        floyeds_triangle(5);
    }
}
