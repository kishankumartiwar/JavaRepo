import java.util.Scanner;

public class conditional {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if (age >= 18) {
      System.out.println("you are eligible to vote");
    } else {
      System.out.println("you are not eligible to drive");
    }
  }
}
