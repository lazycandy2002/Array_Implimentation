/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_implimentation;

import java.util.Scanner;

/**
 *
 * @author makul
 */
public class Array_Implimentation {

    public static int a;
    static stack_room Estack = new stack_room();
    static Scanner reply = new Scanner(System.in);
    static Scanner reply_0 = new Scanner(System.in);
    static Scanner reply_1 = new Scanner(System.in);

    public static void main(String[] args) {

        start();

    }

    public static void start() {
        System.out.println("--------------------------------");
        Estack.display();
        System.out.println("--------------------------------");
        System.out.println("");
        Estack.isfull();
        Estack.isNull();
        Estack.headandtail();
        System.out.println("");
        System.out.println("Press 1. Insert Element into the Queue");
        System.out.println("      2. Delete Element into the Queue");
        System.out.println("");
        filter_1();

    }

    static void filter_1() {
        int reply_a = reply.nextInt();
        a = reply_a;
        switch (a) {

            case 1:

                System.out.println("Enter any Numbers:");
                int reply_b = reply_0.nextInt();
                Estack.Enqueue(reply_b);
                start();
                break;
            case 2:

                System.out.println("");
                System.out.println("Y/N?:");
                String reply_c = reply_1.nextLine();

                switch (reply_c) {

                    case "Y":
                        Estack.Dequeue();
                    case "N":
                        start();
                    default:
                        System.out.println("INVALID, TRY AGAIN");
                        filter_1();
                        break;

                }
            default:
                System.out.println("INVALID, TRY AGAIN");
                filter_1();
                break;

        }
    }
}
