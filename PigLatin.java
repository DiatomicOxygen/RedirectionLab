public class PigLatin {
  public static void main(String[] args) {

  }

  public static String pigLatinSimple(String s) {
    String ans = "";
    if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') {
      ans = s + "hay";
    } else {
      ans = s.substring(1) + s.charAt(0) + "ay";
    }
    return ans;
  }

  public static String pigLatin(String s) {
    String ans = "";
    String[] diagraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};

    for (String diagraph : diagraphs) {
      if (s.substring(0,2).equals(diagraph)) {
        ans = s.substring(2) + diagraph + "ay";
        return ans;
      }
    }
    return pigLatinSimple(s);
  }
}
