public class IfElseStatement1 {

	public static void main(String[] args) {
		
		System.out.print("Leap year or not: ");
        int year = 2023;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
	}

}
