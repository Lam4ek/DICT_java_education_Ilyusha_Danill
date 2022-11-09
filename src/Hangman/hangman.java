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
		char[] splittedWord = answer.toCharArray();
		int attempts = 8;
		String[] arr = new String[splittedWord.length];
		int guessesLetter = 0;
		String[] guess = new String[splittedWord.length];
		for (int i = 0; i < splittedWord.length; i++){
			arr[i] = "-";
		}
		Scanner userAnswer = new Scanner(System.in);
		while (attempts>0) {
			System.out.println(attempts);
			System.out.println(guessesLetter);
			System.out.println(Arrays.toString(arr) + "\n" + "Input a letter ");
			String letter = userAnswer.nextLine();
			if (letter.length() > 1) {
				System.out.println("Input only one letter");
				continue;
			}
			if (answer.indexOf(letter) == -1){
				System.out.println("That letter doesn't appear in the word");
				attempts = attempts -1;
			}
			else{
				boolean found = Arrays.asList(guess).contains(letter);
				if (found == true) {
					System.out.println("No improvements");
					attempts = attempts - 1;
					guessesLetter = guessesLetter - 1;
				}
				for (int i = 0; i < splittedWord.length; i++) {
					if (answer.charAt(i) == letter.charAt(0)) {
						arr[i] = letter;
						guessesLetter++;
						guess[i] = letter;
					}
				}
			}
			if (guessesLetter == answer.length()) {
				System.out.println("You guessed the word!" + "\n" + "You survived!");
				break;
			}
			if (attempts == 0) {
				System.out.println("You lost!");
			}
		}
		userAnswer.close();
	}
		
	




	public static String repeat(int count, String with) {
		return new String(new char[count]).replace("\0", with);
	}
	
	
}
