//LinkedStach and parenthesis problem
import java.util.LinkedList;
public class Main
{
    public interface Stack<E>
    {

    }
    public static class LinkedStack<E> implements Stack<E>
    {
        private SinglyLinkedList<E> stack = new SinglyLinkedList<>();
        public LinkedStack(){}
        public int size() { return stack.size(); }
        public boolean isEmpty() { return stack.isEmpty(); }
        public E top() { return stack.first(); }
        public E pop() { return stack.removeFirst(); }
        public void push(E elem) { stack.addFirst(elem);}
    }

    //Matching parenthesis
    public static boolean isMatched(String expression)
    {
        final String opening = "({[";
        final String closing = ")}]";
        LinkedStack<Character> stack = new LinkedStack<>();
        for (char c:expression.toCharArray())
        {
            if (opening.indexOf(c) != -1)
                stack.push(c);
            if (closing.indexOf(c) != -1)
            {
                if (stack.isEmpty())
                    return false;
                if (closing.indexOf(c) != opening.indexOf(stack.top()))
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        /*LinkedStack<Integer> linkedStack = new LinkedStack<>();
        System.out.println(linkedStack.isEmpty());
        linkedStack.push(8);
        linkedStack.push(5);
        linkedStack.push(3);
        System.out.println(linkedStack.top());
        linkedStack.pop();
        System.out.println(linkedStack.top());*/
        System.out.println(isMatched("([{}])() "));
    }
}
