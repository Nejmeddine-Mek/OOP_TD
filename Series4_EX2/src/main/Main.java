package main;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the expression: ");
		String userInput = scanner.nextLine();
		ParenthesizedExpression exp = new ParenthesizedExpression(userInput);
		
		if(exp.validParenthesis()) {
			System.out.println("Your expression is Valid, Good job! 🔥🔥🔥");
		} else {
			System.out.println("Oops, you missed some parenthesis there, let's go oer them again and fix your expression! 🤯🤕");
		}
		
		scanner.close();
	}
}
