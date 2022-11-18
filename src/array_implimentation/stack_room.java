/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_implimentation;

/**
 *
 * @author Jared Gamutin
 */
public class stack_room {

    int head;
    int tail;
    int capacity = 10;
    int istack[];

    stack_room() {
        head = -1;
        tail = -1;
        istack = new int[capacity];
    }

    void peek() {
        if (head == -1 && tail == -1) {
            System.out.println("There is no element inside the queue to display");
        } else {
            System.out.println("The element at the Front Node is : " + istack[head]);

        }
    }

    boolean isNull() {
        return head == -1 && tail == -1;
    }

    boolean isfull() {
        return tail == capacity - 1;
    }

    void Enqueue(int data) {
        if (tail == capacity - 1) {
            System.out.println("You have reach the maximum limit");
            return;
        }
        if (head == -1 && tail == -1) {
            head = 0;
            tail = 0;
        } else {
            tail = tail + 1;
        }
        istack[tail] = data;

    }

    void Dequeue() {
        if (head == -1 && tail == -1) {
            System.out.println("Queue is Empty");
            return;
        } else if (tail == head) {
            head = tail = -1;
        } else {
            head = head + 1;
        } 

    }
    void headandtail(){
        if (isNull()){
            System.out.println("The Head is null");
            System.out.println("The Tail is null");
        }else{
        System.out.println("The Head is "+ istack[head]);
        System.out.println("The Tail is "+ istack[tail]);
    }}

    void display() {
        if (head == -1) {
            System.out.println("The Queue is Empty");
        } else {
            for (int i = head; i <= tail; i++) {
                System.out.println(" [ " + istack[i] + " ]");
            }
        }
    }

}
