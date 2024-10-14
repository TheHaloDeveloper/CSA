// Login Project - Anay Mittal
import java.util.Scanner;

public class LoginGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will generate secure logins for users in the Tech I Love company.");
        System.out.println("");

        // getting input from user
        System.out.print("What is your first name? ");
        String firstName = scanner.nextLine().toLowerCase(); // getting lowercase first name

        System.out.print("What is your middle name? ");
        String middleName = scanner.nextLine().toLowerCase(); // getting lowercase middle name

        System.out.print("What is your last name? ");
        String lastName = scanner.nextLine().toLowerCase(); // getting lowercase last name

        System.out.print("What is your birthdate (use MMDDYYYY)? ");
        String birthdate = scanner.nextLine(); // getting birthdate

        // login parts
        String partOne = lastName.substring(lastName.length() - 2); // last two chars from last name
        String partTwo = middleName.substring(0, 3); // first three chars from middle name
        String partThree = birthdate.substring(2, 4); // getting "day" part from birthdate
        String partFour = new StringBuilder(firstName.substring(0, 3)).reverse().toString(); // first three chars of first name reversed (online it said to use a StringBuilder in order to reverse the string)

        // combine login parts
        String login = partOne + partTwo + partThree + partFour;             
            
        // display login to user
        System.out.println("");
        System.out.println("Your login is: " + login);
    }
}