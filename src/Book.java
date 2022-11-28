import java.util.List;

public class Book {


    /**
     * COMPLETE THIS CLASS FIRST, THEN CONTINUE WITH AUTHOR AND BIOGRAPHY
     * Create a custom constructor that will take 3 args and defines the Book object
     * Define Book class fields as name, genre, totalPage
     */

    //Create 3 args custom constructor here
    //YOUR CODE HERE
    public Book(String name, String genre, int totalPage) {

        this.name = name;
        this.genre = genre;
        this.totalPage = totalPage;
    }


    //Define instance variables here
    //YOUR CODE HERE


    public String name;
    public String genre;
    public int totalPage;

    public static final String askBook = "Would you like to enter book info? (Y/N)";
    public static final String askAnotherBook = "Would you like to enter another book info? (Y/N)";
    public static final String askNameBook = "What is name of the book?";
    public static final String askgenre = "What is genre of the book?";
    public static final String askbookpage = "How many pages does book have?";


   public static Book createBook(){

       String bookName = ScannerHelper.getString(askNameBook);
       String bookGenre = ScannerHelper.getString(askgenre);
       int bookPage = ScannerHelper.getInt(askbookpage);

       return new Book(bookName, bookGenre, bookPage);
   }



    /*
        Override toString() method that returns Book object information
     */
    //YOUR CODE HERE


    @Override
    public String toString() {
        return "Book{" +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPage=" + totalPage +
                '}';
    }


}