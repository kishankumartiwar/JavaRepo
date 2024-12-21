import java.util.Scanner;

public class prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter the num  ");
    int num = sc.nextInt();
    boolean val = isPrime(num);
    System.out.println(val);
  }

  public static boolean isPrime(int num) {
    int i = 2;
    while (i < num) {
      if (num % i == 0) {
        return false;
      }
      i++;
    }
    return true;
  }
}
