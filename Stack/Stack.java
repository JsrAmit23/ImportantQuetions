package Stack;

public class Stack {
    private int stack[];
    private int stackSize;
    int top=0;


    public Stack(int size){
        this.stackSize = size;
        this.stack = new int[size];
    }

    public void push(int data){
        if(top>=stack.length){
            System.out.println("Statck is full");
            return;
        }
        stack[top] = data;
        top++;
    }


    public int pop(){
        int data=0;
        if(isEmpty())return data;
        top--;

        data = stack[top];
        stack[top]=0;


        return data;
    }

    public void show(){
        for(int i =0;i<stack.length;i++){
            System.out.println(stack[i]);
        }
    }
    public boolean isEmpty(){
        return top<=0;
    }

    public int peek(){
        return stack[top-1];
    }
}
