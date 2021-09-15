public class TestDemo1 {
    public static void main(String[] args) {
        try{//可能会出现异常的代码
            System.out.println(10/0);
            System.out.println(1==2);
        }catch (Exception e){//处理异常
            e.printStackTrace();
        }

        System.out.println("hello");

    }
}
