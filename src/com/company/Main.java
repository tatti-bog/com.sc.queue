package com.company;
import ibadts.Queue;
import ibadts.Stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        hm1();
    }
    public static void hm1 ()
    {

        // create a new queue
        Queue<Integer> queue = new Queue<>();

        // add some numbers to it
        for (int i = 0; i<6; i++)
        {
            queue.enqueue(i);
        }

        // count the elements
        int counter = 0;

        while(!queue.isEmpty())
        {
            counter = counter +1;
            queue.dequeue();
        }

        System.out.println(counter);

    }

    

}
