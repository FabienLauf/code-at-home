package com.expedia.interview.ex2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Exercise2 {

    static class SinglyLinkedListNode {
        SinglyLinkedListNode next;
    }

    static boolean hasCycle(SinglyLinkedListNode head) {
        return false;
    }




    /**
     *
     * All the code below is not necessary for solving the Exercise.
     * It is just used for test cases.
     *
     */

    public static void main(String[] args) {
        testList(1, 1, null);
        testList(2, 3, null);
        testList(3, 4, 2);
        testList(4, 20000000, null);
        testList(5, 20000000, 19999999);
    }

    static void testList(int testId, int elemCount, Integer cycleIndex) {
        SinglyLinkedList list = createList(elemCount, cycleIndex);
        boolean result = hasCycle(list.head);
        boolean expected = !(cycleIndex==null);
        String log = result == expected ? "Correct! Test case %d passed!" : "Test case %d incorrect!";
        System.out.println(String.format(log, testId));
    }

    static SinglyLinkedList createList(int elemCount, Integer cycleIndex) {
        SinglyLinkedList list = new SinglyLinkedList();

        for (int i = 0; i < elemCount; i++) {
            list.insertNode();
        }

        SinglyLinkedListNode extra = new SinglyLinkedListNode();
        SinglyLinkedListNode temp = list.head;

        if(cycleIndex!=null) {
            for (int i = 0; i < elemCount; i++) {
                if (i == cycleIndex) {
                    extra = temp;
                }

                if (i != elemCount - 1) {
                    temp = temp.next;
                }
            }

            temp.next = extra;
        }
        return list;
    }

    static class SinglyLinkedList {
        SinglyLinkedListNode head;
        SinglyLinkedListNode tail;

        public void insertNode() {
            SinglyLinkedListNode node = new SinglyLinkedListNode();

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
}