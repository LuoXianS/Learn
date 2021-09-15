public class TestDEmo {
    public static boolean isequals(String[] word1,String[] word2){
        String str1 = "";
        for (int i = 0; i < word1.length; i++) {
            str1+=word1[i];
        }
        String str2 = "";
        for (int i = 0; i < word2.length; i++) {
            str2+=word2[i];
        }
        return  str1.equals(str2);
    }
    public static void main(String[] args) {
        String[] str1 = {"ab","c"};
        String[] str2 = {"a","cb"};
        System.out.println(isequals(str1,str2));


    }
}
