import java.util.Scanner;

class PasswordCheck {
    private String password;

    public PasswordCheck() {
        password = "password123";
    }

    public void check() {
        Scanner keyboard = new Scanner(System.in);
        boolean correct = false;

        while (!correct) {
            System.out.print("Enter the password :: ");
            String userInput = keyboard.nextLine();

            if (userInput.equals(password)) {
                System.out.println("VALID");
                correct = true;
            } else {
                System.out.println("INVALID");
            }
        }
    }
}