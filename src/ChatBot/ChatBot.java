package ChatBot;
import java.util.Scanner;
public class ChatBot {
	public static void main(String[] args) {
		String BotName = "ChatBot";
		int age = 2022;
		System.out.println("Hello! My name is " + BotName + "\n" + "I was created in " + age + "\n" + "Please, remind me your name");
		Scanner YourName = new Scanner(System.in);
		System.out.println("What a great name you have, " + YourName.nextLine() + "\n" + "Let me guess your age" + "\n" + "Enter remainders of dividing your age by 3, 5 and 7.");
		Scanner remainder3 = new Scanner(System.in);
		Scanner remainder5 = new Scanner(System.in);
		Scanner remainder7 = new Scanner(System.in);
		int YourAge = ((remainder3.nextInt() * 70 + remainder5.nextInt() * 21 + remainder7.nextInt() * 15) % 105);
		System.out.println("Your age is " + YourAge + "; thats a good time to start programming!");
	}
}
