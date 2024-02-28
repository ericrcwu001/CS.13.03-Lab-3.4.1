import java.util.LinkedList;

public class CISStack<T> {

    // Linked list property.
    private LinkedList<T> ll;

    // Size property.
    private int size;

    // Constructor.
    public CISStack() {
        ll = new LinkedList<>();
        size = 0;
    }

    // Push. This method pushes a value onto the top of the stack.
    public void push(T val) {
        ll.addLast(val);
        size++;
    }

    // Pop. This method pops a value from the top of the stack.
    public T pop() {
        T tmp = ll.removeLast();
        size--;
        return tmp;
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty() {
        return size == 0;
    }

    // size. Returns the size of the queue.
    public int size() {
        return size;
    }

    // toString. Returns a description of the queue in, for example, the following format:
    // CISStack{stack=[7, 11], size=2}
    public String toString() {
        StringBuilder s = new StringBuilder("CISStack{stack=[");
        for (int i = 0; i < ll.size(); ++i) {
            s.append(ll.get(i).toString());
            if (i < ll.size() - 1) s.append(", ");
        }
        s.append("], size=");
        s.append(size);
        s.append("}");
        return s.toString();
    }

}
