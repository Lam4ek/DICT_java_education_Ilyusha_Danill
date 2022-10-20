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
		System.out.println("Your age is " + YourAge + "; thats a good time to start programming!" + "\n" + "Now i will prove to you that i can count to any number you want.");
		Scanner n = new Scanner(System.in);
		int number = n.nextInt();
		for(int i = 0; i <= number; i++){
			System.out.println(i + "!");
		}
		System.out.println("Let's test your programming knowledge" + "\n" + "Why do we use methods?" + "\n" + "1. To repeat a statement multiple times." + "\n" + "2. To decompose a program into several small subroutines." + "\n" + "3. To determine the execution timeof a program" + "\n" + "4. To interrupt the execution of a program.");
		int a = 1;
		while (a<2) {
			Scanner answer = new Scanner(System.in);
			if (answer.nextInt() == 2) {
				System.out.println("Great, you right" + "\n" + "Goodbye, have a nice day!");
				break;
			} 
			else {
				System.out.println("Please, try again.");
			}
		}
	}
}
