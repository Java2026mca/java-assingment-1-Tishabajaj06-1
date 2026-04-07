import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int totalRows = 2 * n - 1;

        for (int i = 1; i <= totalRows; i++) {
            int spaces, innerSpaces;

            if (i <= n) {
                spaces = n - i;
                innerSpaces = 2 * i - 3;
            } else {
                spaces = i - n;
                innerSpaces = 2 * (totalRows - i + 1) - 3;
            }

            
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

          
            if (innerSpaces < 0) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int j = 0; j < innerSpaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            // Move to next line (except last line)
            if (i != totalRows) {
                System.out.println();
            }
        }
    }
}
