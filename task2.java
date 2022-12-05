// Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

// не совсем понял, что значит реализация через linkedlist. Возможно, имелось в виду преобразование очереди во что то другое и обратно, но сделал стандартными методами

package DZ;

import java.util.LinkedList;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        for (int j = 0; j < 10; j++) {
            qu.add(j);
        }
        System.out.println("начальная очередь " + qu);

        System.out.println("очередь с добавленным элементом в конец очереди " + enqueue(qu, 111));

        System.out.println("Первый элемент очереди, который удален: " + dequeue(qu));

        System.out.println("Первый элемент очереди, не удаленный " + first(qu));

        System.out.println("Очередь после изменения " + qu);

    }

    public static Queue<Integer> enqueue(Queue<Integer> que, int n) {
        que.add(n);
        return que;
    }

    public static int dequeue(Queue<Integer> que) {
        return que.remove();
    }

    public static int first(Queue<Integer> que) {
        return que.peek();
    }

}
