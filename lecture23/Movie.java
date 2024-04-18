public class Movie {
    private String title;
    private String director;
    private String genre;
    private int year;

    public Movie(String title, String director, String genre, int year) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    /*
     *  The class should have private instance variables for title, director, genre, and year.
     *  Implement a constructor that takes parameters for initializing all instance variables.
     *  Implement getter methods for all instance variables.
     *  displayDetails() that prints out all the details of the movie.
     */

     public void displayDetails() {
        System.out.println("Movie: " + title + " was directed by " + director + " in year " + year);
     }

}
