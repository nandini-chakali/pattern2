public class Pattern2{
    public static void main(String[] args) {
 
        int rows = 4;

 
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
 
                if (i % 2 == 1 && j % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}