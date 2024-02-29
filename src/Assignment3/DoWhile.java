package src.Assignment3;

public class DoWhile {
    public static void main(String[] args){
        int choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            choice=1;
        } while (choice < 1 || choice > 2);

        System.out.println("You chose option " + choice);


    }
}
