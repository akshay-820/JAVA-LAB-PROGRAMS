import java.util.Arrays;

public class GQueue<T> {
    private T[] que;
    private int size;

    public GQueue() {
        que = (T[]) new Object[2];
        size = 0;
    }

    public void enqueue(T element) {
        if (size == que.length) {
            int newCapacity = que.length * 2;
            que = Arrays.copyOf(que, newCapacity);
        }
        que[size++] = element;
    }

    public T dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return null; // or throw exception
        }
        T del_element = que[0];
        System.arraycopy(que, 1, que, 0, size - 1);
        que[--size] = null;
        return del_element;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(que[i]);
        }
    }

    public static void main(String[] args) {
        GQueue<Integer> integerQueue = new GQueue<>();
        integerQueue.enqueue(10);
        integerQueue.enqueue(4);
        integerQueue.enqueue(2);
        integerQueue.enqueue(12);
        integerQueue.display();
        System.out.println("After dequeue:");
        integerQueue.dequeue();
        integerQueue.dequeue();
        integerQueue.display();
    }
}
