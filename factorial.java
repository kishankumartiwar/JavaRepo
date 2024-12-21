import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number for which you want to calculate factorial");
    int num = sc.nextInt();
    int fact = facto(num);
    System.out.println(fact);
  }

  public static int facto(int num) {
    int fact = 1;
    if (num == 0 || num == 1) {
      return 1;
    } else {
      for (int i = num; i >= 1; i--) {
        fact = fact * i;
      }
      return fact;
    }
  }

}
