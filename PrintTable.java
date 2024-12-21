import java.util.Scanner;

public class PrintTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    table(num);
  }

  public static void table(int num) {
    for (int i = 1; i < 11; i++) {
      int tb = num * i;
      System.out.println(num + " X " + i + "=" + tb);
    }
  }
}
