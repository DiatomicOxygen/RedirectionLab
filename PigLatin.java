import java.util.Scanner;
public class PigLatin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner lineSc;
    String ans = "";

    while (sc.hasNextLine()) {
      lineSc = new Scanner(sc.nextLine());
      while (lineSc.hasNext()) {
        ans += pigLatinBest(lineSc.next()) + " ";
      }
      ans = ans.trim(); //ans = ans.substring(0, ans.length() - 1) also works
      lineSc.close();
      System.out.println(ans);
      ans = "";
    }
    sc.close();
  }

  public static String pigLatinSimple(String s) {
    String lowerS = s.toLowerCase();
    String ans = "";
    if (lowerS.charAt(0) == 'a' || lowerS.charAt(0) == 'e' || lowerS.charAt(0) == 'i' || lowerS.charAt(0) == 'o' || lowerS.charAt(0) == 'u') {
      ans = lowerS + "hay";
    } else {
      ans = lowerS.substring(1) + lowerS.charAt(0) + "ay";
    }
    return ans;
  }

  public static String pigLatin(String s) {
    String lowerS = s.toLowerCase();
    String ans = "";
    String[] diagraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    if (lowerS.length() > 1) {
      for (String diagraph : diagraphs) {
        if (lowerS.substring(0,2).equals(diagraph)) {
          ans = lowerS.substring(2) + diagraph + "ay";
          return ans;
        }
      }
    }
    return pigLatinSimple(s);
  }

  public static String pigLatinBest(String s) {
    String lowerS = s.toLowerCase();
    if (!(lowerS.charAt(0) >= 97 && lowerS.charAt(0) <= 122)) {
      return lowerS;
    }
    String newS = "";
    String punctuation = "";
    for (int i = 0; i < lowerS.length(); i++) {
      if ((lowerS.charAt(i) >= 97 && lowerS.charAt(i) <= 122) || lowerS.charAt(i) == 39) {
        newS += lowerS.charAt(i);
      } else {
        punctuation += lowerS.charAt(i);
      }
    }
    return pigLatin(newS) + punctuation;
  }
}
