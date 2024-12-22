import java.util.Scanner;

public class palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the num:");
    int num = sc.nextInt();
    boolean isPal = ispalindrome(num);
    if (isPal) {
      System.out.println(num + " is palindrome");
    } else {
      System.out.println(num + " is not palindrome");
      ;
    }
  }

  public static boolean ispalindrome(int num) {
    int revDigit = reverse(num);
    if (revDigit == num) {
      return true;
    }
    return false;
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
