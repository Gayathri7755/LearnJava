package src.Assignment3;

public class WhileLoop {
    public static void main(String[] args){
        int prev = 0;
        int current = 1;
        int next;

        while (current <= 100) {
            next = prev + current;
            prev = current;
            current = next;
        }

        System.out.println("The first Fibonacci number greater than 100 is: " + current);

    }
}
