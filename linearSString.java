package Functions1.DataDtructure;

public class linearSString {
   public static int linearString(String menu[], String key){
    for(int i=0; i<menu.length; i++){
         if(menu[i] == key){
            return i;
           } 
         }
         return -1;
    }
   
       public static void main(String[] args) {
        String menu[] = {"Dosa", "chhole bhature","pizza","maggi"};
       String key = "pizza";

       int result = linearString(menu, key);
       if(result != -1){
        System.out.println("Result found at index: "+result);
       } else {
        System.out.println("NOT Found");
       
    }
}
}
