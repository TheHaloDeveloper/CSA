import java.util.Scanner;

public class Chatbot {
    private Scanner scanner;

    public Chatbot() {
        scanner = new Scanner(System.in);
    }

    public void startChat() {
        System.out.println("Hello! I'm ChatBot3000. Type 'Bye' to end the conversation.");
        
        String userInput = "";

        while (!userInput.equalsIgnoreCase("Bye")) {
            userInput = scanner.nextLine().trim();

            if (userInput.equalsIgnoreCase("Hi")) {
                System.out.println("Hello! How can I help you?");
            } else if (userInput.equalsIgnoreCase("How are you?")) {
                System.out.println("I'm a chatbot, but I'm here to help you!");
            } else if (userInput.equalsIgnoreCase("What's your name?")) {
                System.out.println("I'm ChatBot3000, your friendly assistant.");
            } else if (userInput.equalsIgnoreCase("Bye")) {
                System.out.println("Goodbye! Have a great day!");
            } else {
                System.out.println("Sorry, I didn't understand that.");
            }
        }
    }
}