import java.util.*;

public class calculator {

    public static void main(String[] args) {
        float FirstNumber = 0;
        float SecondNumber = 0;
        float Result = 0;
        int x = 1;
        while (true) {
            System.out.println("please choose from 1 to 5 ");
            System.out.println("1-add");
            System.out.println("2-subtract ");
            System.out.println("3-multiply  ");
            System.out.println("4-divide  ");
            System.out.println("5-exit ");

            Scanner c = new Scanner(System.in);
            x = c.nextInt();
            if (x == 1) {
                System.out.print("please insert First number ");
                Scanner a = new Scanner(System.in);
                FirstNumber = a.nextInt();

                System.out.print("please insert second number ");
                Scanner b = new Scanner(System.in);
                SecondNumber = b.nextInt();
                Result = FirstNumber + SecondNumber;
                System.out.print("the result of Adding is: ");
                System.out.println(Result);

            } else if (x == 2) {
                System.out.print("please insert First number ");
                Scanner a = new Scanner(System.in);
                FirstNumber = a.nextInt();

                System.out.print("please insert second number ");
                Scanner b = new Scanner(System.in);
                SecondNumber = b.nextInt();
                Result = FirstNumber - SecondNumber;
                System.out.print("the result of Subtract is: ");
                System.out.println(Result);
            } else if (x == 3) {
                System.out.print("please insert First number ");
                Scanner a = new Scanner(System.in);
                FirstNumber = a.nextInt();

                System.out.print("please insert second number ");
                Scanner b = new Scanner(System.in);
                SecondNumber = b.nextInt();
                Result = FirstNumber * SecondNumber;
                System.out.print("the result of multiply is: ");
                System.out.println(Result);
            } else if (x == 4) {
                System.out.print("please insert First number ");
                Scanner a = new Scanner(System.in);
                FirstNumber = a.nextInt();

                System.out.print("please insert second number ");
                Scanner b = new Scanner(System.in);
                SecondNumber = b.nextInt();
                Result = FirstNumber / SecondNumber;
                System.out.print("the result of Divide is: ");
                System.out.println(Result);
            } else if (x == 5) {
                System.exit(0);
            } else {
                System.out.println("wrong selection  ");
            }
        }
    }
}


