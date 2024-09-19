package com.ohgiraffers.section01.list;

import java.util.LinkedList;
import java.util.Queue;

public class Application4 {
    public static void main(String[] args) {

        // Queue

        // FIFO

        /*
        *
        * */

        Queue<String> que = new LinkedList<>();

        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        System.out.println("que.peek() = " + que.peek());
        System.out.println("que = " + que);

        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);

    }
}
