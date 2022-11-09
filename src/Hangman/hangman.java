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
		int attempts = 7;
		String[] arr = new String[splittedWord.length];
		int guesses = 0;
		for (int i = 0; i < splittedWord.length; i++){
			arr[i] = "-";
		}
		Scanner userAnswer = new Scanner(System.in);
		while (attempts>0) {
			System.out.println(Arrays.toString(arr) + "\n" + "Input a letter ");
			String letter = userAnswer.nextLine();
			if (letter.length() > 2) {
				System.out.println("Input only one letter");
			}
			if (answer.indexOf(letter) == -1){
				System.out.println("That letter doesn't appear in the word");
				attempts = attempts -1;
			}
			else{
				for (int i = 0; i < splittedWord.length; i++) {
					if (answer.charAt(i) == letter.charAt(0)) {
						arr[i] = letter;
						guesses++;
					}
				}
			}
			if (guesses == answer.length()) {
				System.out.println("Thanks for playing!" + "\n" + "We'll see how well you did in the next stage");
				break;
			}
		}
		userAnswer.close();
	}
		
	




	public static String repeat(int count, String with) {
		return new String(new char[count]).replace("\0", with);
	}
	
	
}
