package Basics;
import java.util.Scanner;

public class W1_FunFactsGenerator {
	public static void main(String[] args) {
		// Set up scanner for user input
		Scanner scanner = new Scanner(System.in);

		// Introduction
		System.out.println("🎉 Welcome to the Fun Facts Generator! 🎉");

		// Collecting user input
		System.out.print("What's your name? ");
		String name = scanner.nextLine();

		System.out.print("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine(); // consume leftover newline

		System.out.print("What's your favorite hobby? ");
		String hobby = scanner.nextLine();

		System.out.print("Pick your favorite number: ");
		int number = scanner.nextInt();

		// Fun facts output
		System.out.println("\n👋 Hi " + name + "!");
		System.out.println("✨ You are " + age + " years wise!");
		System.out.println("🎨 In the future, you will be famous for your amazing " + hobby + " skills.");
		System.out.println(
				"🔮 Did you know that your favorite number " + number + " multiplied by 7 is " + (number * 7) + "?");
		System.out.println("🚀 Fun fact: In dog years, you're about " + (age * 7) + " years old!");
		System.out.println("💡 You're ready to rock Java. Let’s go!");

		// Close scanner
		scanner.close();
	}
}