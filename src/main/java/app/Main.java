package app;

// Import for StringUtils class
import org.apache.commons.lang3.StringUtils;
// Import for Input scanner class
import util.Input;

public class Main {
    public static void main(String[] args) {

        // Create new instance of input class
        Input input = new Input();
        // Prompt user to enter a string
        System.out.println("Enter something: ");
        // Grab user input with getString method
        String userInput = input.getString();

        // Is input numeric
        System.out.println("Input is numeric: " + StringUtils.isNumeric(userInput));
        // Flip the case of the string
        System.out.println("Input is flipped: " + StringUtils.swapCase(userInput));
        // Reverse the string
        System.out.println("Input is reversed " + StringUtils.reverse(userInput));

    }
}
