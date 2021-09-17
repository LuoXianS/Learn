import java.util.*;

public class TestDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(8);
        list.add(34);
        list.add(23);
        Collections.sort(list);
        for (int s :
                list) {
            System.out.println(s);
        }
    }
    public static void main1(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三，三班，成绩：33");
        list.add("张四，二班，成绩：43");
        list.add("张五，五班，成绩：53");
        list.add("张六，六班，成绩：63");
        Iterator<String> objectIterator = list.iterator();
        while(objectIterator.hasNext()){
            System.out.println(objectIterator.next());
        }
    }
}
