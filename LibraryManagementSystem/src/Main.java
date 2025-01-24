//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);  // Scanner for user input
                int choice;

                // Loop to display menu until user chooses to exit
                do {
                    // Display the menu
                    System.out.println("========================================");
                    System.out.println("|          Library Management          |");
                    System.out.println("========================================");
                    System.out.println("| 1 - Create a New Member              |");
                    System.out.println("| 2 - Add Book                         |");
                    System.out.println("| 3 - Remove Book                      |");
                    System.out.println("| 4 - Issue Book                       |");
                    System.out.println("| 5 - Display All Books                |");
                    System.out.println("| 6 - Display Available Books          |");
                    System.out.println("| 7 - Exit                             |");
                    System.out.println("========================================");
                    System.out.print("Please enter your choice: ");

                    // Get user choice
                    choice = scanner.nextInt();

                    // Perform action based on user choice
                    switch (choice) {
                        case 1:
                            System.out.println("Create a New Member option selected.");
                            // Add logic for creating a new member
                            break;
                        case 2:
                            System.out.println("Add Book option selected.");
                            // Add logic for adding a new book
                            break;
                        case 3:
                            System.out.println("Remove Book option selected.");
                            // Add logic for removing a book
                            break;
                        case 4:
                            System.out.println("Issue Book option selected.");
                            // Add logic for issuing a book
                            break;
                        case 5:
                            System.out.println("Display All Books option selected.");
                            // Add logic for displaying all books
                            break;
                        case 6:
                            System.out.println("Display Available Books option selected.");
                            // Add logic for displaying available books
                            break;
                        case 7:
                            System.out.println("Exiting the system. Goodbye!");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }

                } while (choice != 7);  // Exit the loop when user selects option 7
            }
        }

    }
}