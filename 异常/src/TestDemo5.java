public class TestDemo5 {
    public  static int  countSegments(String s) {
        String[] str = s.split(" ");
        int size = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")||str[i].isEmpty()){
                continue;
            }
            size++;
        }
        return size;
    }
    public static void main(String[] args) {
        String str = "Hello, my name is John";
        System.out.println(countSegments(str));


    }
}
