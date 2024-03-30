
import java.util.Scanner;


public class passwordValidator {



    //System.out.println("Hello world!");


    public static boolean validatePassword(String password) {
        if (password.length() < 8) {
            return false;

        }
// checking for a presence of numbers
        boolean containnsNumber = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                containnsNumber = true;
                break;
            }
        }

        return containnsNumber;


    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password;
        boolean isvalidpassword= false;

// loop through until valid passowrd is Enter
        while(!isvalidpassword){
            System.out.print("Enter Password:");
            password = scanner.nextLine();
            isvalidpassword =validatePassword(password);

            if (!isvalidpassword){

                System.out.println("password must be at least 8 characters long");
            }



        }

        System.out.println("password is valid");



    }
}
