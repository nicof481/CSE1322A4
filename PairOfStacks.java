// Name:        Nicolas Federico
// Class:       CS 3305 / W04
// Term:        Fall 2022
// Instructor:  Sharon Perry
// Assignment:  04-Part-1-Stacks

import static java.lang.System.out;
import java.util.*;

class PairOfStacks {

    int top_a, top_b; 
    int[] arr;

    // constructor to initiate arrary length
    // and set top & bottom signals for empty array
    PairOfStacks(int n) {
        arr = new int[n];
        top_a = arr.length;
        top_b = -1;
    }

    int pop_a() {
        int prevTop = arr[top_a];
        top_a--;
        return arr[prevTop];
    }
    String pop_b() {
        int prevTop = arr[top_b];
        top_b--;
        return arr[prevTop];
    }
    void push_a(int n) {
        if (!isFull()) {
            top1++;
        }

    }
    void push_b(int n) {

    }
    boolean is_empty_a() {
        return false;
    }
    boolean is_empty_b() {
        return false;
    }
    boolean is_full() {
        return false;
    }

    public static void main(String[] args) {
        new PairOfStacks
    }
}
