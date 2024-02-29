package src.Assignment2;

import java.util.*;

public class IfStatement1 {
    public static void main(String[] args) {
        System.out.print("check if a number is positive, negative, or zero: ");
        int num =-7;

        if (num > 0) {
            System.out.println(num+" is positive");
        } else if (num < 0) {
            System.out.println(num+" is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
