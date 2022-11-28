import java.util.ArrayList;
import java.util.List;

public class Author {





    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    //YOUR CODE HERE

    public Author(String firstName, String lastName, String country, boolean isAlive, int age, ArrayList<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
        this.books = books;
    }





    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    //YOUR CODE HERE

    public String firstName;
    public String lastName;
    public String country;
    public boolean isAlive;
    public int age;
    public static ArrayList<Book> books = new ArrayList<>();


    public static final String askName = "What is your favorite author's first name?";
    public static final String askLastName = "What is your favorite author's last name?";
    public static final String askCountry = "Where is your favorite author's from?";
    public static final String askisAlive = "Your favorite author's is Alive? (Y/N)";
    public static final String askAge = "How old is your author?";




    public static Author createAuthor() {

        String fName = ScannerHelper.getString(askName);
        String lName = ScannerHelper.getString(askLastName);
        String country = ScannerHelper.getString(askCountry);
        String alive = ScannerHelper.getString(askisAlive);
        boolean isAlive = false;
        int age = 0;
        if (alive.equalsIgnoreCase("y")) {
            isAlive = true;
            age = ScannerHelper.getInt(Author.askAge);

        }
        if (alive.equalsIgnoreCase("n")) {
            isAlive = false;
    }

        ArrayList<Book> books = new ArrayList<>();
        do{
            String askBook = ScannerHelper.getString(books.isEmpty() ? Book.askBook : Book.askAnotherBook);
            if (askBook.equalsIgnoreCase("n")) break;
            books.add(Book.createBook());

        }while(true);
        return new Author(fName, lName, country, isAlive, age, books);


    }


    /*
    Override toString() method here that returns Author object information
     */
    //YOUR CODE HERE




    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                ", age=" + age +
                ", books=" + books +
                '}';
    }
}
