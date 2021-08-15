package Queue;

public class Queue {
    private int front;
    private int rear;
    private int size;
    private int queue[];
    private int queueSize;
    Queue(int size){

        this.queueSize = size;
        queue = new int[queueSize];
        this.front =0;
        this.size =0;
        this.rear = size-1;
    }

    public void enqueue(int data){
        if(size == queueSize){
            System.out.println("Queue is full");
            return;
        }
        else {
            rear=(rear+1)%queueSize;
            size++;
            queue[rear]=data;
            System.out.println(data+" Enqueued to Queue");
        }
    }
    public int dequeue(){
        int data;
        if(size==0){
            System.out.println("Queue is empty");
            return 0;
        }
        else{
            data = queue[front];
            front = (front+1)%queueSize;
            size--;
        }

        return data;
    }

    public void show(){
        System.out.print("Elements: ");
        for(int i=0;i<size;i++){
            System.out.print(queue[(front+i)%queueSize]+ " ");
        }
        System.out.println();
        for (int n: queue){
            System.out.print(n+" ");
        }
    }

}
