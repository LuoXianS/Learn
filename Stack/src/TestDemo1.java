
//实现栈
class stack{
    private int index;
    private int[] stack;

    public stack(int i) {
        index = 0;
        this.stack = new int[i];
    }
    public int push(int num ){
        if (isFull()){
            throw new RuntimeException("栈为满");
        }
        stack[this.index++] = num;
        return stack[this.index-1];
    }
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("栈为空");
        }
        index--;
        return stack[index];
    }
    public int peek(){
        if (isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        return stack[index-1];
    }
    public boolean isEmpty(){
        return  this.index == 0;
    }
    public boolean isFull(){
        return this.index == stack.length;
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        stack stack = new stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());//5
        System.out.println(stack.pop());//5
        System.out.println(stack.peek());//5
        System.out.println(stack.pop());//5
        System.out.println(stack.peek());//5
        System.out.println(stack.pop());//5
        System.out.println(stack.peek());//5
        System.out.println(stack.pop());//5
        System.out.println(stack.isEmpty());
    }
}
