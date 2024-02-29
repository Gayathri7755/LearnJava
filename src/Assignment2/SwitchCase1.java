package src.Assignment2;

public class SwitchCase1 {

	public static void main(String[] args) {
		System.out.print("Total Days in a month ");
        int month = 11;

        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = 28; 
                break;
            default:
                days = -1; 
        }
        
        if (days != -1) {
            System.out.println( month + ": " + days);
        } else {
            System.out.println("Invalid month number");
        }

	}

}
