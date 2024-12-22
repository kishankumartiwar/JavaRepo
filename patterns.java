import java.util.Scanner;

public class patterns {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    rightPyramid(row);
    upsidedownPyramid(row);
  }

  public static void rightPyramid(int row) {
    for (int i = 1; i <= row; i++) {

      for (int j = 1; j <= row - i; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  public static void upsidedownPyramid(int rows) {
    for (int i = 0; i <= rows; i++) {
      for (int j = rows - i; j > 0; j--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
