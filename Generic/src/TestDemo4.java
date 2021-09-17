import java.util.ArrayList;

class student{
   private   String name;
   private  String class1;
   private  double score;

    public String getName() {
        return name;
    }

    public String getClass1() {
        return class1;
    }

    public double getScore() {
        return score;
    }

    public student(String name, String class1, double score) {
        this.name = name;
        this.class1 = class1;
        this.score = score;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", class1='" + class1 + '\'' +
                ", score=" + score +
                '}';
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        ArrayList<student> arrayList = new ArrayList<>();
        arrayList.add(new student("张三","三班",33));
        arrayList.add(new student("王五","四班",44));
        arrayList.add(new student("李四","五班",53));
        for (student s:
             arrayList) {
            System.out.println(s);

        }

    }
}
