import java.util.Scanner;

public class oddSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter num n for whic you want the odd sum till");
    int n = sc.nextInt();
    int oddsum = sum(n);
    System.out.println(oddsum);
  }

  public static int sum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }
}
