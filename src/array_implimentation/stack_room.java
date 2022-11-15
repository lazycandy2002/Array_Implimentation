/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_implimentation;

import java.util.Stack;

/**
 *
 * @author Jared Gamutin
 */
public class stack_room {

    int head;
    int tail;
    int capacity = 10;
    int[] istack;

    stack_room() {
        head = -1;
        tail = -1;
        istack = new int[capacity];
    }

    boolean isNull() {
        return tail <= head;
    }

    int Enqueue(int data) {
        return istack[++tail] = data;

    }

    int Dequeue() {
        if (isNull()) {
            System.out.println("Queue is Empty");
        }
        if (tail >= head) {
            return istack[++head];

        }
        return (Integer) null;
    }

    int size() {
        return tail - head;

    }

}
