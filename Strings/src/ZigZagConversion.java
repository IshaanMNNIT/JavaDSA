import java.util.Scanner;

public class ZigZagConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int nums_rows = in.nextInt();
        if (nums_rows <= 1 || nums_rows >= s.length()) {
            System.out.println(s);
            return;
        }

        // Initialize the 2D array
        char arr[][] = new char[nums_rows][s.length()];
        int i = 0, row = 0;
        boolean goingDown = true;

        // Fill the zigzag pattern
        while (i < s.length()) {
            arr[row][i] = s.charAt(i);
            if (goingDown) {
                row++;
                if (row == nums_rows) {
                    row = nums_rows - 2;
                    goingDown = false;
                }
            } else {
                row--;
                if (row < 0) {
                    row = 1;
                    goingDown = true;
                }
            }
            i++;
        }

        // Build the final result
        StringBuilder ans = new StringBuilder();
        for (int r = 0; r < nums_rows; r++) {
            for (int c = 0; c < s.length(); c++) {
                if (arr[r][c] != '\0') {
                    ans.append(arr[r][c]);
                }
            }
        }

        System.out.println(ans.toString());
    }
}
