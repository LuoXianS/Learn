import org.omg.CORBA.Object;

class MyArrayList<T>{
   private T[] elem;
   private int useSize;
   public void add(T data){
       this.elem[useSize] = data;
       this.useSize++;
   }
   public T get(int i){
       return this.elem[i];
   }
    public MyArrayList() {
        this.elem =  (T[]) new Object[10];
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList  = new MyArrayList<>();
        MyArrayList<Integer> myArrayList1 = new MyArrayList<>();
       /* MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add("sad");
        String str =(String) myArrayList.get(1);
        System.out.println(str);*/
    }
}
