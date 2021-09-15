import java.util.*;
public class main {
    public static  String reverse(String string,int size,int left1,int right1 ){
        if (size<=0||size>string.length()||string == null){
            return null;
        }
        char[] chr = string.toCharArray();
        int left  = left1;
        int right = right1;
        while (left<right){
            char tmp = chr[left];
            chr[left]= chr[right];
            chr[right] = tmp;
            left++;
            right--;
        }

        return String.valueOf(chr);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String str = scanner.next();
        String str1 = reverse(str,size,0,size-1);
        String str2 = reverse(str1,size,size,str.length()-1);
        String str3 = reverse(str2,size,0,str.length()-1);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
