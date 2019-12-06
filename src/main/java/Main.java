import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        //  prompt for the user's name
        System.out.print("Enter the integer number to convert to roman: ");

        // get their input as a String
        Integer number = Integer.valueOf(scanner.next());

        RomanNumeral roman = new RomanNumeral(number);
        System.out.println(String.format("RESULT: %s", roman.toString()));
    }
}
