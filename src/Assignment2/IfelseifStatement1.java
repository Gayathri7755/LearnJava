
public class IfelseifStatement1 {

	public static void main(String[] args) {
		System.out.print("Categorize based on age: ");
        int age = 75;

        if (age < 0) {
            System.out.println("Age cannot be negative.");
        } else if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

	}

}
