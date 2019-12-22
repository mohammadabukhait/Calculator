import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static final int ADD_OPTION = 1;
    public static final int SUB_OPTION = 2;
    public static final int MULTIPLY_OPTION = 3;
    public static final int DIVIDE_OPTION = 4;
    public static final int EXIT_OPTION = 5;

    public static void main(String[] args) {
        while (true) {
            printMenu();
            Scanner inputScanner = new Scanner(System.in);
            try {
                processInput(inputScanner);
            } catch (InputMismatchException e) {
                System.out.println("invalid option");
            }
        }
    }

    private static void processInput(Scanner inputScanner) {
        int option;
        option = inputScanner.nextInt();
        if (option == EXIT_OPTION) {
            exit();
        }
        UserInput userInput = readInput(inputScanner);
        switch (option) {
            case ADD_OPTION:
                addTwoNumbers(userInput);
                break;
            case SUB_OPTION:
                subTwoNumbers(userInput);
                break;
            case MULTIPLY_OPTION:
                multiplyTwoNumbers(userInput);
                break;
            case DIVIDE_OPTION:
                divideTwoNumbers(userInput);
                break;
            default:
                System.out.println("wrong selection  ");
        }
    }

    private static UserInput readInput(Scanner inputScanner) {
        System.out.print("please insert First number ");
        double firstNumber = inputScanner.nextDouble();
        System.out.print("please insert second number ");
        double secondNumber = inputScanner.nextDouble();
        return new UserInput(firstNumber, secondNumber);
    }

    private static void printMenu() {
        System.out.println("please choose from 1 to 5 ");
        System.out.println("1-add");
        System.out.println("2-subtract ");
        System.out.println("3-multiply  ");
        System.out.println("4-divide  ");
        System.out.println("5-exit ");
    }

    private static void exit() {
        System.exit(0);
    }

    private static void divideTwoNumbers(UserInput userInput) {
        System.out.println("the result of divide is: " + (userInput.firstNumber / userInput.secondNumber));
    }

    private static void multiplyTwoNumbers(UserInput userInput) {
        System.out.println("the result of multiply is: " + (userInput.firstNumber * userInput.secondNumber));
    }

    private static void subTwoNumbers(UserInput userInput) {
        System.out.println("the result of Subtract is: " + (userInput.firstNumber - userInput.secondNumber));
    }

    private static void addTwoNumbers(UserInput userInput) {
        System.out.println("the result of Adding is: " + (userInput.firstNumber + userInput.secondNumber));
    }

    private static class UserInput {
        private double firstNumber;
        private double secondNumber;

        public UserInput(double firstNumber, double secondNumber) {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        }
    }
}


