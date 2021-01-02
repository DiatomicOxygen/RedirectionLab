import java.util.Scanner;
public class MakeStars {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nextLn = "";
    String ans = "";

    while (sc.hasNextLine()) {
      nextLn = sc.nextLine().toLowerCase();
      for (int i = 0; i < nextLn.length(); i++) {
        if (nextLn.charAt(i) >= 97 && nextLn.charAt(i) <= 122) {
          ans += "*";
        } else {
          ans += nextLn.charAt(i);
        }
      }
      ans = ans.trim();
      System.out.println(ans);
      ans = "";
    }
    sc.close();

  }
}
