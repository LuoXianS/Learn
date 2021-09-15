

public class TestDemo2 {
  public static  String reverse(String string){
      char[] chr = string.toCharArray();
      int i = 0;
      int j = chr.length-1;
      while(i<j){
          char tmp = chr[i];
          chr[i] = chr[j];
          chr[j] = tmp;
          i++;
          j--;

      }
      //return new String(chr);
      return String.valueOf(chr);
  }
    public static void main(String[] args) {
      String str = "abcde";
      String str1 = reverse(str);
        System.out.println(str1);

    }
}
