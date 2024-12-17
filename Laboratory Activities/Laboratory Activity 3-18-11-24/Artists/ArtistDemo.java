package Artists;

public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();
        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();
        System.out.println();

        Painter painter = new Painter("Leonardo da Vinci", "Italian", 67, "Painting", Medium.OIL);
        painter.displayInfo();
        System.out.println();

        Writer writer = new Writer("J.K. Rowling", "British", 58, "Writing Novels", WritingStyle.FICTION);
        writer.displayInfo();
        System.out.println();

        Dancer dancer = new Dancer("Martha Graham", "American", 96, "Choreography", DanceStyle.CONTEMPORARY);
        dancer.displayInfo();
        System.out.println();
    }
}
