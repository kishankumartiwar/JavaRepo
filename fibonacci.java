import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the num n : ");
    int num = sc.nextInt();
    System.out.println("here is your fibonacci series");
    printFibonacci(num);
  }

  public static void printFibonacci(int num) {

    if (num < 0) {
      return;
    }
    System.out.println("0 ");
    if (num == 0) {
      return;
    }
    System.out.println("1 ");
    int first = 0;
    int second = 1;
    while (first + second <= num) {
      int fib = first + second;
      first = second;
      second = fib;
      System.out.println(fib);
    }
  }
}
