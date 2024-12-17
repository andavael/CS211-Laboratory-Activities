import java.util.Scanner;

public class GettingInputs{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the year: ");
        int year = input.nextInt();
        input.nextLine();

        System.out.print("Enter the genre: ");
        String genre = input.nextLine();

        System.out.print("Enter the album: ");
        String album = input.nextLine();

        System.out.print("Enter the song title: ");
        String title = input.nextLine();

        System.out.print("Enter the artist: ");
        String artist = input.nextLine();

        System.out.println("--------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("--------------------------");
        System.out.println("Year Released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: " + "\"" + title + "\"");
        System.out.println("Artist: " + artist + "\n");

        input.close();
    }
}