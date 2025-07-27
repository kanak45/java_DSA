package Functions1;

public class hollowT {
    public static void hollow_rectangle (int toRows,int toCols) {
        //outerloop
        for(int i=1; i<=toRows; i++){
          //inner - column
          for(int j=1; j<=toCols; j++){
            //cell- (i, j)
            if(i==1 || i==toRows || j==1 || j==toCols){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
          }
          System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(4,5);
    }
}
