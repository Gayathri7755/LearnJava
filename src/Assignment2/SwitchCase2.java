package src.Assignment2;

public class SwitchCase2 {

	public static void main(String[] args) {
		int marks = 75;
		char grade;

		switch (marks / 10) {
		    case 9:
		    case 10:
		        grade = 'A';
		        break;
		    case 8:
		        grade = 'B';
		        break;
		    case 7:
		        grade = 'C';
		        break;
		    case 6:
		        grade = 'D';
		        break;
		    default:
		        grade = 'F';
		}
		System.out.println("Grade: " + grade);


	}

}
