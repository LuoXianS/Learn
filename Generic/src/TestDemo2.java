import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//迭代器  用来打印集合中的元素
public class TestDemo2 {
    public static void main(String[] args) {
        String s ="welcome to bie";
        System.out.println(s.length());
    }
    public static void main1(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> integerIterator = list.iterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
}
