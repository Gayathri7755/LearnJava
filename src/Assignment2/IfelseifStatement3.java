public class IfelseifStatement3 {

	public static void main(String[] args) {
		System.out.println("--Tax Calculator-- ");
        double income = 75000;
        double tax = 0;

        if (income <= 10000) {
            tax = 0;
        } else if (income <= 30000) {
            tax = 0.1 * (income - 10000);
        } else if (income <= 70000) {
            tax = 2000 + 0.2 * (income - 30000);
        } else {
            tax = 12000 + 0.3 * (income - 70000);
        }

        System.out.println("Tax to be paid: " + tax);
    }

	}


