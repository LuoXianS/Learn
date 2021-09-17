import com.sun.xml.internal.ws.message.stream.StreamHeader11;

import java.util.ArrayList;
import java.util.List;
//判断一个字符串是否有另一字符串
public class TestDemo5 {
    public static String up(String str1,String str2){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str1.length(); i++) {
            char r = str1.charAt(i);
            if (!str2.contains(r+"")){
                sb.append(r);
            }
        }
        return String.valueOf(sb);
        }
    public static void main(String[] args) {
        String str1 = "welcome to bie";
        String str2 = "come";
        String str3 = up(str1,str2);
        System.out.println(str3.toString());
    }
}
