public class Main
{
    public interface Queue<E>
    {
        void enqueue(E e);
        E dequeue();

        E first();

        int size();
        boolean isEmpty();
    }

    public static class ArrayBasedQueue<E> implements Queue<E>
    {
        private E[] data;
        private int size = 0;
        private int idx = -1;

        public ArrayBasedQueue(int capacity)
        {
            data = (E[]) new Object[capacity];
        }

        public int size() { return size; }

        public boolean isEmpty() { return size == 0; }
        public void enqueue(E e)
        {
            if (idx + 1 <= data.length)
            {
                data[++idx] = e;
                size++;
            }
            else
                throw new IllegalStateException("Queue is full");
        }

        public E dequeue()
        {
            if (isEmpty()) return null;
            size--;
            E ret = data[idx];
            data[idx] = null;
            if (isEmpty())
                idx = -1;
            else
                idx--;
            return ret;
        }

        public E first()
        {
            if (isEmpty())
                return null;
            return data[idx];
        }
    }

    public static void main(String[] args)
    {
        ArrayBasedQueue<Integer> arq = new ArrayBasedQueue<>(10);
        arq.enqueue(4);
        arq.enqueue(1);
        arq.enqueue(7);
        arq.enqueue(0);
        System.out.println(arq.first());
        arq.dequeue();
        System.out.println(arq.first());

    }
}
