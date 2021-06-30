import java.util.Scanner;

public class SecondQuestion {
  public static void main(String[] args) {
    System.out.println("请输入一个正整数(1~10)");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n < 1 || n > 10) {
      System.out.println("无效数据!");
      return;
    }
    System.out.print(n + "!=");
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result = result * i;
      if (i == n)
        System.out.print(i + "=");
      else
        System.out.print(i + "x");
    }
    System.out.print(result);
  }
}