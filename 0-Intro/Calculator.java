import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number: ");
		double num1 = input.nextDouble();

		System.out.println("Enter operation (+, -, *, /): ");
		String op = input.next();

		System.out.println("Enter second number: ");
		double num2 = input.nextDouble();

		double result = 0;
		boolean divZero = false;	
		boolean defltCase = false;

		switch (op) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
                                break;
			case "/":
				if (num2 != 0) {
					result = num1 / num2;
				} else {
					System.out.println("Division by zero error.");
					divZero = true;
				}
				break;
			default:
				System.out.println("Invalid operation!");
				defltCase = true;
		}
		if (!divZero && !defltCase) {
			System.out.println("Result: " + result);
		}
		input.close();
	}
}
