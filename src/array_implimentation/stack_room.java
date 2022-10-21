/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_implimentation;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Jared Gamutin
 */
public class stack_room {

    Queue<String> array = new LinkedList<>();
   String a,b;
    public stack_room() {

    }

    void add(String numbers) {
        array.add(numbers);
    }

    void remove() {
        array.remove();
        
    }

    void head() {
        a = array.peek();
    }

    void tail() {
        b = array.poll();
    }

    void view_stack() {
        System.out.println(array);
    }

}
