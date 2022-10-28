/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_implimentation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Jared Gamutin
 */
public class stack_room {

    Stack array = new Stack ();
   String a,b;
    public stack_room() {

    }

    void add(String numbers) {
        array.add(numbers);
    }

    void remove() {
        array.pop();
        
    }

    void head() {
        a = array.peek.toString();
    }

    void tail() {
        b = array.poll();
    }

    void view_stack() {
        System.out.println(array);
    }

}
