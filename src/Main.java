//Pseudocode:
//1. Create a package named 'bookrecommendation'.
//2. Import the Scanner class.
//3. Define the main method.
//   a. Initialize a Scanner object.
//   b. Create a char variable 'continueChoice'.
//   c. Use a do-while loop for the recommendation process.
//      i. Display a welcome message.
//      ii. Get the user's name.
//      iii. Get the user's age.
//      iv. Get the user's favorite book genre.
//      v. Call the recommendBook method with user inputs.
//      vi. Ask if the user wants to continue.
//   d. Close the scanner.
//4. Define the recommendBook method.
//   a. Accept age, genre, and name as parameters.
//   b. Use if-else statements to recommend books based on age and genre.
//   c. Call the printRecommendation method to display recommendations.
//5. Define print method to simplify output.
//6. Define getUserString method to get user input as a string.
//7. Define getUserChoice method to get a single character user choice.
//8. Define printRecommendation method to display book recommendations.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;

        do {
            System.out.println("Hi, I can recommend a book based on your age and the genre of books you are interested in.");
            String name = getUserString("May I know your name? ");

            int age = Integer.parseInt(getUserString("How old are you, " + name + "? "));

            String genre = getUserString("What is your favorite book genre? ");
            recommendBook(age, genre, name);

            continueChoice = getUserChoice("Do you want to continue? (Yes/No) ");
        } while (continueChoice == 'Y' || continueChoice == 'y');

        print("Bye!");
        scanner.close();
    }

    public static void recommendBook(int age, String genre, String name) {
        if (age >= 10 && age <= 18) {
            if (genre.equalsIgnoreCase("detective")) {
                printRecommendation(name, "The Hound of the Baskervilles by Arthur Conan Doyle");
            }
        } else if (age >= 18 && age <= 44) {
            if (genre.equalsIgnoreCase("non-fiction")) {
                printRecommendation(name, "How Big Things Get Done by Bent Flyvbjerg");
            }
        }
        if (age >= 18 && age <= 44) {
            if (genre.equalsIgnoreCase("detective")) {
                printRecommendation(name, "Murder on the Orient Express by Agatha Christie");
            }
        } else if (age >= 10 && age <= 18) {
            if (genre.equalsIgnoreCase("non-fiction")) {
                printRecommendation(name, "In Cold Blood by Truman Capote");
            }
        }
        if (age >= 45 && age <= 74) {
            if (genre.equalsIgnoreCase("detective")) {
                printRecommendation(name, "The Maltese Falcon by Dashiell Hammett");
            }
        } else if (age >= 75) {
            if (genre.equalsIgnoreCase("non-fiction")) {
                printRecommendation(name, "The Name of the Rose by Umberto Eco");
            }
        }
        if (age >= 75) {
            if (genre.equalsIgnoreCase("detective")) {
                printRecommendation(name, "The Big Sleep by Raymond Chandler");
            }
        } else if (age >= 45 && age <= 74) {
            if (genre.equalsIgnoreCase("non-fiction")) {
                printRecommendation(name, "In the Woods by Tana French");
            }
        }
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static String getUserString(String prompt) {
        Scanner scanner = new Scanner(System.in);
        print(prompt);
        return scanner.nextLine();
    }

    public static char getUserChoice(String prompt) {
        Scanner scanner = new Scanner(System.in);
        print(prompt);
        return scanner.next().charAt(0);
    }

    public static void printRecommendation(String name, String bookTitle) {
        print("Based on your answers, " + name + ", I recommend you the book named:");
        print(bookTitle);
    }
}