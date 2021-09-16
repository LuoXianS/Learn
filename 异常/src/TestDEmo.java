import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.ArrayList;
import java.util.Arrays;

public class TestDEmo {
    public static void maopao(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            Boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }
            }
            if (flag == false){
                return;
            }
        }
    }
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
        String str = "javalasddf";
        String[] st1 = str.split("");
        for (int i = 0; i < st1.length ;i++) {
            System.out.println(st1[i]);

        }
    }
    public static void main1(String[] args) {
       /* String[] str1 = {"ab","c"};
        String[] str2 = {"a","cb"};
        System.out.println(isequals(str1,str2));*/
        int[] arr= new int[]{3,5,7,2,4,5,7};
        maopao(arr);
        System.out.println(Arrays.toString(arr));


    }
}
