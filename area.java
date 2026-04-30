import java.util.Scanner;

public class area{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the length: ");
        int length = input.nextInt();

        System.out.print("Enter the width: ");
        int width = input.nextInt();

        int area  = length * width;

        System.out.print("The area of the rectangle of length " + length + " and width " + width + " is: " + area + " square meters");
        System.out.println();
        input.close();

    }
}