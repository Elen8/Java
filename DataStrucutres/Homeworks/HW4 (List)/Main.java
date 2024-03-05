

public class SinglyLinkedList
{
    private static class Node
    {
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n)
        {
            element = e;
            next = n;
        }
        public E getElement() { return element; } 
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> n) { next = n; }
    }
    
    private static size = 0;
    private Node<E> head = null;
    private Node<E> tail = null;
    public SinglyLinkedList() {}
    public static int size() { return size; }
    public static boolean isEmpty() { return size == 0; }
    public void addFirst(E elem)
    {
        head = new Node<>(elem, head);
        if (size == 0)
            tail = head;
        size++;
    }
    
    public void addLast(E elem)
    {
        Node<E> newElem = new Node<>(elem, null);
        if (isEmpty())
            head = newElem;
        else
            tail.setNext(newElem);
            tail = newElem;
            size++;
    }
    
    public E removeFirst()
    {
        if (isEmpty()) return null;
        E first = head.getElement();
        head = head.getNext();
        size--;
        if (size == null)
            tail = null;
        return first;
    }
    
    public E first()
    {
        if (isEmpty()) return null;
        else return head.getElement();
    }
    
    public E last()
    {
        if (isEmpty()) return null;
        else return tail.getElement();
    }
}

public class DoublyLinkedList
{
    private static class Node
    {
        private E element;
        private Node<E> next;
        private Node<E> prev;
        public Node(E e, Node<E> n, Node<E> p)
        {
            element = e;
            next = n;
            prev = p;
        }
        public E getElement() { return element; } 
        public Node<E> getNext() { return next; }
        public Node<E> getPrev() { return prev; }
        public void setNext(Node<E> n) { next = n; }
        public void setPrev(Node<E> p) { prev = p; }
    }
    
    private static size = 0;
    private Node<E> head;
    private Node<E> tail;
    public DoublyLinkedList()
    {
        head = new Node<>(null, null, null);
        tail = new Node<>(null, head, null);
        head.setNext(tail);
    }
    public static int size() { return size; }
    public static boolean isEmpty() { return size == 0; }
    public void addFirst(E elem)
    {
        addBetween(elem, header, header.getNext());
    }
    
    public void addLast(E elem)
    {
        addBetween(elem, tail.getPrev(), tail);
    }
    
    public E removeFirst()
    {
        if (isEmpty()) return null;
        return removeNode(head.getNext());
    }
    
    public E removeLast()
    {
        if (isEmpty()) return null;
        return removeNode(tail.getPrev());
    }
    
    public E first()
    {
        if (isEmpty()) return null;
        else return head.getElement();
    }
    
    public E last()
    {
        if (isEmpty()) return null;
        else return tail.getElement();
    }
    
    private void addBetween(E e, Node<E> predecessor, Node<E> successor)
    {
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }
    
    private E removeNode(Node<E> node)
    {
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }
}

public class Main
{
	
}
