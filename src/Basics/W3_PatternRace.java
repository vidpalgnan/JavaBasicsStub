package Basics;
import java.util.Scanner;
public class W3_PatternRace{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        System.out.println("🎮 Welcome to Pattern Race!");

        do {
            // TODO: Show menu and get user choice
            System.out.println("\nChoose a pattern:");
            System.out.println("1. Rectangle");
            System.out.println("2. StairsLeft");
            System.out.println("3. StairsRight");
            System.out.println("4. Pyramid");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            // TODO: Call the corresponding method based on user choice
            switch (choice) {
                case 1:
                    drawRectangle(scanner);
                    break;
                case 2:
                    drawLeftStairs(scanner);
                    break;
                case 3:
                    drawRightStairs(scanner);
                    break;
                case 4:
                    drawPyramid(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }

            // TODO: Ask user if they want to play again
            System.out.print("\nWanna try another? (yes/no): ");
            playAgain = scanner.next().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    // TODO: Draw rectangle of "#" with given rows and columns
    public static void drawRectangle(Scanner scanner) {
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // TODO: Use nested loops to draw rectangle
        // Example: 3 X 5
        // # # # # # 
        // # # # # # 
        // # # # # # 
    }

    // TODO: Draw left stairs of "*" growing row by row
    public static void drawLeftStairs(Scanner scanner) {
        System.out.print("Enter the number of steps: ");
        int steps = scanner.nextInt();

        // TODO: Use nested loop to draw left-aligned stairs
        // Example: 4 steps
		//	*
		//	**
		//	***
		//	****
        
    }

    // TODO: Draw right stairs of "@" aligned to the right
    public static void drawRightStairs(Scanner scanner) {
        System.out.print("Enter the number of steps: ");
        int steps = scanner.nextInt();

        // TODO: First print spaces, then print @
        // Example for 3 steps:
        //   @
        //  @@
        // @@@
    }

    // TODO: Draw a pyramid using "*"
    public static void drawPyramid(Scanner scanner) {
        System.out.print("Enter the height of the pyramid: ");
        int height = scanner.nextInt();
        // Example
		//     *
		//    ***
		//   *****
		//  *******
		// *********
        // Step-by-step breakdown:
        // Outer loop goes from 1 to height
        for (int i = 1; i <= height; i++) {

            // Step 1: Print spaces before the stars
            // TODO: How many spaces? Think: height - i

            // Step 2: Print the stars
            // TODO: How many stars? 
            // Think: (2 * i - 1)

            // Step 3: Move to the next line
        }
    }
}
