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
}
