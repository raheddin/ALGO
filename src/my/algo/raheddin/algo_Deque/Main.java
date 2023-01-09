package my.algo.raheddin.algo_Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    /*
    * In this tutorial, we’ll show how to use the Java's ArrayDeque class – which is an implementation of Deque interface.
       An ArrayDeque (also known as an “Array Double Ended Queue”, pronounced as “ArrayDeck”)
       is a special kind of a growable array that allows us to add or remove an element from both sides.
      An ArrayDeque implementation can be used as a Stack (Last-In-First-Out) or a Queue(First-In-First-Out).
    * */

    /*
    Operation	            Method	        Method throwing Exception
    Insertion from Head	    offerFirst(e)	addFirst(e)   +
    Removal from Head	    pollFirst()	    removeFirst()
    Retrieval from Head	    peekFirst()	    getFirst()
    Insertion from Tail	    offerLast(e)	addLast(e)
    Removal from Tail	    pollLast()	    removeLast()
    Retrieval from Tail	    peekLast()	    getLast()
     */

    public static void main(String[] args) {

        //Using ArrayDeque as a Stack  LIFO
        Deque<String> stack = new ArrayDeque<>();
        stack.push("Raheddin");
        stack.push("Asadzade");
        System.out.println(stack.getFirst());
        stack.pop();
        System.out.println(stack);
        System.out.println("----------------");

        //Using ArrayDeque as a Queue FIFO
        Deque<String> queue = new ArrayDeque<>();
        queue.push("Raheddin");
        queue.push("Asadzade");
        System.out.println(queue.getLast());
        queue.poll();
        System.out.println(queue);
        System.out.println("------");

        //Deque
        Deque<String> deque = new ArrayDeque<>();
        deque.offerFirst("FCB");
        System.out.println(deque);
        deque.offerFirst("XL");
        System.out.println(deque);
        deque.offerLast("GS");
        deque.offerLast("FB");
        System.out.println(deque);
        deque.addFirst("FCN");
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
        System.out.println(deque.peekLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peek());
        deque.poll();
        System.out.println(deque);
        deque.offer("NC");
        System.out.println(deque);
        /*
            [FCB]
            [XL, FCB]
            [XL, FCB, GS, FB]
            [FCN, XL, FCB, GS, FB]
            [XL, FCB, GS, FB]
            [XL, FCB, GS]
            GS
            XL
            XL
            [FCB, GS]
            [FCB, GS, NC]
        */








    }
}
