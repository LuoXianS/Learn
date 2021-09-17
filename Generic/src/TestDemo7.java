import java.util.ArrayList;
import java.util.List;

public class TestDemo7 {
    public static List<List<Integer>> lists(int num){
        List<List<Integer>> lists = new ArrayList<>();
        if (num<= 0) {
          return null;
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        lists.add(list);
        for (int i = 1; i < num; i++) {
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            for (int j =1 ; j <i; j++) {
                list1.add(lists.get(i-1).get(j)+lists.get(i-1).get(j-1));
                }
            list1.add(1);
            lists.add(list1);
        }
        return lists;
     }
    public static void main(String[] args) {
        System.out.println(lists(5));

    }
}
