import java.util.*;

public class arithmetic {
  public static void main(String[] args) {
    int a;
    int b;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter num A and B ....");
    a = sc.nextInt();
    b = sc.nextInt();
    int sum = a + b;
    int multiply = a * b;
    int divide = a / b;
    int subtract = a - b;
    System.out.println("addition of A and B is : " + sum);
    System.out.println("multiplication of A and B is : " + multiply);
    System.out.println("divide of A and B is : " + divide);
    System.out.println("subtraction of A and B is : " + subtract);
  }
}
