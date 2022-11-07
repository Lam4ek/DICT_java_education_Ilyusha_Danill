package Hangman;
import java.util.Scanner;
import java.util.Random;
public class hangman {
	public static void main(String[] args) {
		System.out.println("HANGMAN");
		Scanner userAnswer = new Scanner(System.in);
		String[] words = {"java", "puthon", "javascript", "kotlin"};
		Random random = new Random();
		int index = random.nextInt(words.length);
		String answer = words[index];
		System.out.println(answer);
		if (userAnswer.nextLine().equals(answer)) {
			System.out.println("You survived!");
		}
		else {
			System.out.println("You lost!");
		}
		userAnswer.close();
	}
}