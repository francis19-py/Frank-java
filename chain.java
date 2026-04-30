import java.util.Scanner;

public class chain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();

    String[] days = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (num >= 1 && num <= 7) {
            System.out.println("The day corresponding to " + num + " is: " + days[num]);
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        sc.close();
    }
}