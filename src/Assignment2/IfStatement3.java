package src.Assignment2;

public class IfStatement3 {

	public static void main(String[] args) {
		System.out.print("Largest of Three numbers: ");
		int num1=7,num2=8,num3=4;
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        System.out.println(largest);

	}

}
