public class MovieDatabase {
    private Movie[] arr;
    private int numMovies; 

    public MovieDatabase(int size) {
        arr = new Movie[size];
    }

    public void addMovie(Movie m) {
        arr[numMovies] = m;
        numMovies += 1;
    }

    public Movie searchByTitle(String title) {
        //for (int i=0; i<numMovies; i++) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != null && arr[i].getTitle().equals(title)) {
                return arr[i];
            }
        }

        return null;
    }

    public void displayAllMovies() {
        for (int i=0; i<numMovies; i++) {
            arr[i].displayDetails();
        }
    }

    /*
     * The class should have a private instance variable to store an array of Movie objects.
     * Implement a constructor that takes an integer parameter size to initialize the array size.
     * addMovie(Movie m) add a new Movie object to the database.
     * searchByTitle(String title) returns the movie with matching title, if found.
     * searchByDirector(String director) prints out details of all movies directed by the specified director, if any.
     * displayAllMovies() that prints out details of all movies in the database
     */

}
