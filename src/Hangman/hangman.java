package Hangman;
import java.util.Scanner;
public class hangman {
	public static void main(String[] args) {
		System.out.println("HANGMAN");
		Scanner answer = new Scanner(System.in);
		if (answer.nextLine().equals("java")) {
			System.out.println("You survived!");
		}
		else {
			System.out.println("You lost!");
		}
		answer.close();
	}
}