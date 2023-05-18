
class LinkedList1{

    Node top;

    class Node{
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    LinkedList1()
    {
        top=null;
    }

    public boolean isEmpty()
    {
        if(top==null)
        {
            return true;
        }
        return false;
    }

    boolean isFull()
    {
        Node new_node = new Node(1);
        if(new_node==null)
        {
            return true;
        }
        return false;
    }

    void push(int val)
    {
        Node new_node = new Node(val);

        if(isFull())
        {
            System.out.println("heap is overFlow! \"can't push\" ");
            return;
        }

        new_node.next=top;
        top=new_node;

        System.out.println(val+" has been pushed in stack");

    }

    int pop()
    {
        if(isEmpty())
        {
            System.out.println("stack underFlow! \"can't pop\" ");
            return Integer.MIN_VALUE;
        }
        int val=top.data;
        top=top.next;
        return val;
    }


    int peek()
    {
        if(isEmpty())
        {
            System.out.println("stack Empty! \"can't peek\" ");
            return Integer.MIN_VALUE;
        }

        return top.data;
    }

    void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty!");
            return;
        }

        System.out.println("element in stack :");
        Node temp=top;
        while(temp != null)
        {
            System.out.println( temp.data );
            temp=temp.next;
        }
    }

}
    
    public class stack_LL2 
    {
        public static void main(String[] args)
        {
    
            LinkedList1 sl=new LinkedList1();

            sl.push(5);
            sl.push(15);
            sl.push(25);
            sl.push(35);

            sl.display();

            System.out.println("poped el = "+ sl.pop());
            System.out.println("poped el = "+ sl.pop());
            System.out.println("poped el = "+ sl.pop());
            System.out.println("poped el = "+ sl.pop());
            sl.display();

            System.out.println("poped el = "+sl.pop());



        }
    }

