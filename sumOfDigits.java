import java.util.Scanner;

public class sumOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number ");
    int num = sc.nextInt();
    int sumofdigits = sum(num);
    System.out.println(sumofdigits);
  }

  public static int sum(int num) {
    int sum = 0;
    while (num > 0) {
      sum = sum + (num % 10);
      num /= 10;
    }
    return sum;
  }
}
