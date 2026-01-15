import java.util.*;

public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(12);
        queue.enqueue(9);

        queue.peek();    // 4
        queue.dequeue();
        queue.peek();    // 6
    }
}

class QueueUsingStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int x) {
        stack1.push(x);
    }

    public void dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        stack2.pop();
    }

    public void peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        System.out.println(stack2.peek());
    }
}
