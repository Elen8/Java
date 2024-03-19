public class Main {
    public static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() { return element; }

        public Node<E> getNext() { return next; }

        public void printList(Node<E> n) {
            while (n != null) {
                System.out.println(n.element);
                n = n.next;
            }
        }

        public void setNext(Node<E> n) { next = n; }

        public Node<E> createList(E[] arr) {
            Node<E> head = null;
            for (int i = arr.length - 1; i >= 0; i--) {
                head = new Node<>(arr[i], head);
            }
            return head;
        }

        public static <E extends Comparable<E>> Node<E>[] splitList(Node<E> head) {
            if (head == null)
                return null;
            boolean odd = false;
            Node<E> LOdd = null;
            Node<E> LEven = null;
            Node<E> currentOdd = null;
            Node<E> currentEven = null;

            while (head != null) {
                if (odd) {
                    if (LOdd == null) {
                        LOdd = new Node<>(head.element, null);
                        currentOdd = LOdd;
                    } else {
                        currentOdd.next = new Node<>(head.element, null);
                        currentOdd = currentOdd.next;
                    }
                } else {
                    if (LEven == null) {
                        LEven = new Node<>(head.element, null);
                        currentEven = LEven;
                    } else {
                        currentEven.next = new Node<>(head.element, null);
                        currentEven = currentEven.next;
                    }
                }
                odd = !odd;
                head = head.next;
            }

            Node<E>[] nodes = (Node<E>[]) new Node<?>[2];
            nodes[0] = LOdd;
            nodes[1] = LEven;
            return nodes;
        }

        public static <E extends Comparable<E>> Node<E> mergeSortedLists(Node<E> head1, Node<E> head2) {
            if (head1 == null) {
                return head2;
            }
            if (head2 == null) {
                return head1;
            }

            Node<E> mergedHead;
            if (head1.getElement().compareTo(head2.getElement()) <= 0) {
                mergedHead = head1;
                head1 = head1.getNext();
            } else {
                mergedHead = head2;
                head2 = head2.getNext();
            }

            Node<E> current = mergedHead;

            while (head1 != null && head2 != null) {
                if (head1.getElement().compareTo(head2.getElement()) <= 0) {
                    current.setNext(head1);
                    head1 = head1.getNext();
                } else {
                    current.setNext(head2);
                    head2 = head2.getNext();
                }
                current = current.getNext();
            }

            // Append remaining nodes from the non-empty list
            if (head1 != null) {
                current.setNext(head1);
            } else {
                current.setNext(head2);
            }

            return mergedHead;
        }

        public static <E extends Comparable<E>> Node<E> mergeSortLinkedList(Node<E> head) {
            if (head == null || head.getNext() == null) {
                return head; // Base case: list is already sorted
            }

            // Split the list into two halves
            Node<E>[] split = splitList(head);
            Node<E> L1 = mergeSortLinkedList(split[0]); // Sort the first half
            Node<E> L2 = mergeSortLinkedList(split[1]); // Sort the second half

            // Merge the sorted halves
            return mergeSortedLists(L1, L2);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 7, 8, 9, 1, 4, 2, 4, 8, 0};
        Node<Integer> head = null;
        Node<Integer> node = new Node<>(null, null);
        head = node.createList(arr);
        System.out.println("Original List:");
        node.printList(head);

        Node<Integer>[] splitResult = Node.splitList(head);
        Node<Integer> LOdd = splitResult[0];
        Node<Integer> LEven = splitResult[1];

        System.out.println("Odd List:");
        node.printList(LOdd);

        System.out.println("Even List:");
        node.printList(LEven);

        Node<Integer> merged = Node.mergeSortedLists(LOdd, LEven);
        System.out.println("Merged List:");
        node.printList(merged);

        Node<Integer> sorted = Node.mergeSortLinkedList(head);
        System.out.println("Sorted List:");
        node.printList(sorted);
    }
}
