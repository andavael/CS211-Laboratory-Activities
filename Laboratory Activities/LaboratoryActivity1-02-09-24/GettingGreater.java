import java.util.Scanner;

public class GettingGreater{
    public static void main(String[]args){
        System.out.println("\nGetting the Greater Value");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first character: ");
        char char1 = input.next().charAt(0);

        System.out.print("Enter second character: ");
        char char2 = input.next().charAt(0);

        char greaterChar = (char) Math.max(char1, char2);

        System.out.println("-------------------------------------------");
        System.out.println("The character with greater value is: " + greaterChar);
        System.out.println("-------------------------------------------");

        System.out.println("Showing the ASCII Codes");
        System.out.println(char1 + " : " + (int)char1);
        System.out.println(char2 + " : " + (int)char2 + "\n");

        input.close();
    }
}