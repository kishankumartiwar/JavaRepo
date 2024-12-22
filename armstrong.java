import java.util.Scanner;

public class armstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int num = sc.nextInt();
    boolean isArm = isArmstrong(num);
    if (isArm) {
      System.out.println(num + " it is armstrong num");
    } else {
      System.out.println(num + " is not armstrong");
    }
  }

  public static boolean isArmstrong(int num) {
    int noOfDigits = numOfDigits(num);
    int finalNumber = 0;
    int numCopy = num;
    while (num > 0) {
      int lastDigit = num % 10;
      num = num / 10;
      finalNumber += power(lastDigit, noOfDigits);
    }
    return finalNumber == numCopy;
  }

  public static int numOfDigits(int num) {
    int digits = 0;
    while (num > 0) {
      digits++;
      num = num / 10;
    }
    return digits;
  }

  public static int power(int num1, int num2) {
    int result = 1;
    int i = 0;
    while (i < num2) {
      result = result * num1;
      i++;
    }
    return result;
  }
}
