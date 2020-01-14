public class Queue {
    private static int[] myArrQueue = new int[5];
    private static int front = 0;
    private static int rear = -1;
    private static int size = 0;

    public static void main(String[] args){
        enQueue(42);
        enQueue(34);
        enQueue(67);
        System.out.println(deQueue());
        enQueue(45);
        System.out.println(deQueue());
        System.out.println(deQueue());
    }

    private static void enQueue(int item){
        if(size == myArrQueue.length){
            System.out.println("Queue full");
        }
        else{
            rear = (rear+1) % myArrQueue.length;
            myArrQueue[rear] = item;
            size++;
        }
    }

    private static int deQueue(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int item = myArrQueue[front];
            front=(front+1)%myArrQueue.length;
            size--;
            return item;
        }
    }
}
