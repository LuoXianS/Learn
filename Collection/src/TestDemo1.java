import java.util.HashMap;
import java.util.Map;

public class TestDemo1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("sdf","sdf");
        map.put("qwe","ewq");
        System.out.println(map.get("qwe"));
        System.out.println(map);
    }
}
