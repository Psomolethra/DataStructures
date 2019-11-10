import java.io.PrintStream;
import java.util.NoSuchElementException;


public class StringStackImpl implements StringStack {
    private ListNode head;

    public StringStackImpl(int maxN){
        head=null;
    }

    public boolean isEmpty() {
        return (size()==0);
    }


    public void push(String item){
        head=new ListNode(item,head);
    }


    public String pop() throws NoSuchElementException{
        if(isEmpty()){throw new NoSuchElementException();}
        else{
            String t=head.data;
            head=head.nextNode;
            return t;
        }
    }

    public String peek() throws NoSuchElementException{
        if(isEmpty()){throw new NoSuchElementException();}
        else{
            return head.getObject();
        }
    }


    public void printStack(PrintStream stream){
        ListNode t=head;
        while(t!=null){
            System.out.println(t.getObject());
            t=t.nextNode;
        }

    }

    public int size() {
        int counter = 0;
        ListNode t = head;
        while (t != null) {
            counter++;
            t = t.nextNode;
        }
        return counter;
    }
};