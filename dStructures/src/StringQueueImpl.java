import java.io.PrintStream;
import java.util.NoSuchElementException;

public class StringQueueImpl implements StringQueue {
    private ListNode head, tail;

    StringQueueImpl(int maxN) {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public void put(String item) {
        ListNode t = tail;
        tail = new ListNode(item);
        if (isEmpty()) {
            head = tail;
        } else {
            tail = new ListNode(item);
        }
    }

    public String get() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            String v = head.getObject();
            ListNode t = head;
            head = t.nextNode;
            return v;
        }
    }

    public String peek() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return head.getObject();
        }
    }


    public void printQueue(PrintStream stream) {
        ListNode t = head;
        while (t != null) {
            System.out.println(t.getObject());
            t = t.nextNode;
        }
    }

    public int size(){
        int counter=0;

        ListNode t=head;
        while(t!=null){
            System.out.println(t.getObject());
            counter++;
            t=t.nextNode;

        }
        return counter;

    }
};


