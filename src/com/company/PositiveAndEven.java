import java.util.Scanner;

public class PositiveAndEven {
    public static void main(String[] args) {
        //Write Program to find whether number is positive and even
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to check wether number is positive and even: ");
        int num = in.nextInt();
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Number is positive and even");
            } else {
                System.out.println("Number is positive and odd");
            }
        } else {
            System.out.println("Number is negative");
        }
    }
}