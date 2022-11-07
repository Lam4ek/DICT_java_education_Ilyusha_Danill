package Hangman;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class hangman {
	public static void main(String[] args) {
		System.out.println("HANGMAN");
	
		String[] words = {"java", "python", "javascript", "kotlin"};
		Random random = new Random();
		int index = random.nextInt(words.length);
		String answer = words[index];
		Scanner userAnswer = new Scanner(System.in);
		char[] splittedWord = answer.toCharArray();
		String guesses = "";
		int attempts = 7;
		String str = "-";
		String repeat = repeat((splittedWord.length - 2), "-");

		System.out.println("Guess the word " + splittedWord[0] + splittedWord[1] + repeat);

		if (userAnswer.nextLine().equals(answer)) {
			System.out.println("You survived!");
		}
		else {
			System.out.println("You lost!");
		}
		userAnswer.close();
	}

	public static String repeat(int count, String with) {
		return new String(new char[count]).replace("\0", with);
	}
	
}
