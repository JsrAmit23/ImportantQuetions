package Stack;

public class RunnerClass {
    public static void main(String[] args) {
        Stack stack = new Stack(8);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(1);
        stack.pop();
        stack.peek();
        System.out.println("Peek value is "+stack.peek());



    }
}
