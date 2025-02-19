import java.util.Scanner; // Import Scanner for user input

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        
        // Welcome message and prompt for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read user input and store it in the 'name' variable
        
        // Array of quiz questions and answers
        // Each question consists of:
        //  - The question itself
        //  - Three answer choices (A, B, C)
        //  - The correct answer (last element in the array)
        String[][] quiz = {
            {"What is the capital of France?", "A) Paris", "B) London", "C) Rome", "A"},
            {"What is 5 + 3?", "A) 7", "B) 8", "C) 9", "B"},
            {"Which planet is known as the Red Planet?", "A) Earth", "B) Mars", "C) Jupiter", "B"},
            {"Who wrote 'Hamlet'?", "A) Shakespeare", "B) Dickens", "C) Austen", "A"},
            {"What is the chemical symbol for water?", "A) H2O", "B) O2", "C) CO2", "A"}
        };
        
        int score = 0; // Variable to track the user's score
        
        // Loop through each question in the quiz
        for (String[] question : quiz) {
            System.out.println("\n" + question[0]); // Display the question
            System.out.println(question[1]); // Display option A
            System.out.println(question[2]); // Display option B
            System.out.println(question[3]); // Display option C
            
            String answer; // Variable to store user's answer
            
            // Loop until a valid answer (A, B, or C) is entered
            while (true) {
                System.out.print("Your answer (A, B, C): ");
                answer = scanner.next().toUpperCase(); // Convert input to uppercase to avoid case issues
                
                // Validate input
                if (answer.equals("A") || answer.equals("B") || answer.equals("C")) {
                    break; // Exit the loop if input is valid
                }
                System.out.println("Invalid choice. Please enter A, B, or C."); // Error message for invalid input
            }
            
            // Check if the user's answer is correct
            if (answer.equals(question[4])) {
                score++; // Increment score if the answer is correct
            }
        }
        
        // Display final result and personalized message based on score
        System.out.println("\nQuiz Complete!");
        System.out.println(name + ", you scored " + score + " out of " + quiz.length + ".");
        
        // Provide feedback based on score
        if (score == quiz.length) {
            System.out.println("Excellent job! You got all answers correct!");
        } else if (score >= 3) {
            System.out.println("Good effort! Keep practicing.");
        } else {
            System.out.println("Don't worry, try again! Practice makes perfect.");
        }

        scanner.close(); // Close Scanner to free system resources
    }
}
