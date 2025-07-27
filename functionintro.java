package Functions1.DataDtructure;

public class functionintro {
     public static void update(int marks[],int nonchangable){
        nonchangable =10;
        for(int i=0; i<marks.length; i++){
         marks[i] = marks[i]+2;
        }
     }

    public static void main(String[] args) {
        int marks[] = {96,88,95};
        int nonchangable = 5;
        update(marks,nonchangable);// this is happening because array has call by reference property
        System.out.println(nonchangable);
        //print our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
    }
}
