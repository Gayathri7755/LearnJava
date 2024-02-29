public class SwitchCase3 {

	public static void main(String[] args) {
		String fruit = "orange";
		String taste;

		switch (fruit) {
		    case "apple":
		        taste = "sweet";
		        break;
		    case "lemon":
		        taste = "sour";
		        break;
		    case "orange":
		        taste = "tangy";
		        break;
		    default:
		        taste = "unknown";
		}

		System.out.println("Taste of " + fruit + " is: " + taste);


	}

}
