package ChatBot;
import java.util.Scanner;
public class ChatBot {
	public static void main(String[] args) {
		String BotName = "ChatBot";
		int age = 2022;
		System.out.println("Hello! My name is " + BotName + "\n" + "I was created in " + age + "\n" + "Please, remind me your name");
		Scanner YourName = new Scanner(System.in);
		System.out.println("What a great name you have, " + YourName.nextLine());
	}
}
