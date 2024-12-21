import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int rev = reverse(num);
    System.out.println(rev);

  }

  public static int reverse(int num) {
    int newnum = 0;
    while (num > 0) {
      int digit = num % 10;
      newnum = newnum * 10 + digit;
      num = num / 10;
    }
    return newnum;
  }
}
