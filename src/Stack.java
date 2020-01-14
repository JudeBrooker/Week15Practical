public class Stack {
    private static int[] myArrStack = new int[5];
    private static int top = -1;
    public static void main(String[] args){
        push(5);
        push(12);
        push(56);
        showStack();
        System.out.println(pop());
        System.out.println(pop());
        push(98);
        showStack();
        System.out.println(pop());
    }

    private static void push(int item){
        if(top == myArrStack.length-1){
            System.out.println("Error, Stack is full");
        }
        else{
            top++;
            myArrStack[top] = item;
        }
    }

    private static int pop(){
        if(top == -1){
            System.out.println("Error, Stack is empty");
        }
        else{
            int item = myArrStack[top];
            top --;
            return item;
        }
        return -1;
    }

    private static void showStack(){
        for(int i=0; i<= top; i++){
            System.out.println(myArrStack[i] + " ");
        }
    }
}
