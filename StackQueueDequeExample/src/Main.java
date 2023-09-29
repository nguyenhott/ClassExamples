import java.util.*;

public class Main {
    public static void main(String[] args) {


        //stack example
        Stack<String> myStack = new Stack<>();
        myStack.push("first");
        myStack.push("second");
        myStack.push("third");
        myStack.push("fourth");
        System.out.println(myStack);
        myStack.push("seventh");
        System.out.println(myStack);
        myStack.push("zero");
        System.out.println(myStack);
        String s = myStack.pop();
        System.out.println("myStack " + myStack);
        System.out.println("my element " + s);
        System.out.println("my element" + myStack.peek());

        //queue example
        Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("Karen");
        myQueue.offer("Bob");
        myQueue.offer("Steve");
        myQueue.offer("Carol");
        System.out.println(myQueue);
        System.out.println(myQueue.poll());
        System.out.println(myQueue);
        System.out.println(myQueue.peek());
        System.out.println(myQueue);
        myQueue.poll();
        myQueue.poll();
        System.out.println(myQueue);
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.size());
        myQueue.poll();
        System.out.println(myQueue.peek());
        //System.out.println(myQueue.element());


        //Deque example
        Deque<String> myDeque = new ArrayDeque<>();
        myDeque.push("1");
        myDeque.push("2");
        myDeque.offer("3");
        myDeque.offer("4");
        System.out.println(myDeque);

        Deque<String> mySecondDeque = new LinkedList<>();
        mySecondDeque.addFirst("first");
        mySecondDeque.addFirst("second");
        mySecondDeque.push("third");
        mySecondDeque.offer("fourth");
        mySecondDeque.addLast("fifth");
        System.out.println(mySecondDeque);
        mySecondDeque.pop();
        System.out.println(mySecondDeque);
        mySecondDeque.poll();
        System.out.println(mySecondDeque);
        mySecondDeque.pollLast();
        System.out.println(mySecondDeque);
        System.out.println(mySecondDeque.peek());
        System.out.println(mySecondDeque.peekFirst());
        System.out.println(mySecondDeque.peekLast());
    }
}