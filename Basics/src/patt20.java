public class patt20 {
    public static void main(String[] args) {
     int i , j , k;
     for(i=1;i<=5;i++) {
         if (i != 1 && i != 5) {
             System.out.print("*");
             for (k = 1; k <= 2; k++) {
                 if (i != 1 && i != 5) {
                     System.out.print(" ");
                 }
             }
             System.out.print("*");
             System.out.println();
         }
         else
         {
             for(j=1;j<=4;j++) System.out.print("*");
             System.out.println();
         }
     }
    }
}