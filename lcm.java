import java.util.Scanner;

public class lcm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the numbers that you want to find LCM of");
    int Firstnum = sc.nextInt();
    int Secondnum = sc.nextInt();
    int lcm = LCM(Firstnum, Secondnum);
    System.out.println(lcm);

  }

  public static int LCM(int Firstnum, int Secondnum) {
    int i = 1;
    while (true) {
      int factor = Firstnum * i;
      if (factor % Secondnum == 0) {
        return factor;
      }
      i++;
    }
  }

}
