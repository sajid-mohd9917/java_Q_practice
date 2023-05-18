class Stack {

    static private int Max = 3;
    int top;
    int[] arr = new int[Max];

    Stack()
     {
        top = -1;
    }

    boolean isEmpty() {
        if (top < 0) {

            return true;
        }
        return false;
    }

    boolean isFull() {
        if (top >= Max - 1) {
            return true;
        }
        
        return false;
    }

    void push(int x) {

        if (isFull()) {

            System.out.println("stack overflow :can't push val="+x);
        }
        else
        {
            top++;
            arr[top] = x;
            System.out.println(x + " has been pushed at top =" + top);
        }
    }

    int pop() {
        if (isEmpty()) {

            System.out.println("stack is Empty :can't pop");
            return -1;
        }
       
            int val = arr[top];
            top--;
            return val;
        
       
    }

    int peek() {

        if (isEmpty()) {
            System.out.println("stack is Empty  can't peek");
            return -1;
        }


        int val = arr[top];
        return val;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("No element to print :stack is empty");
            return;
        }

        System.out.println("Elements in stack");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }

}

public class stack_Arr_java2 {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);

        s.display();

        System.out.println(s.pop() + " Element popped");
        System.out.println(s.pop() + " Element popped");
        System.out.println(s.pop() + " Element popped");
        System.out.println(s.pop() + " Element popped");

        System.out.println(s.peek() + " Element peek");


        s.display();


    }
}
