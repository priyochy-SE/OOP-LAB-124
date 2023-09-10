//(Part - 03)
/*
  Made by: @PRIYABRATA CHOWDHURY - 23010105
*/
public class Main 
{
  public static void main(String[] args) 
  {
    Library library = new Library();

    Book book1 = new Book("C: The Complete Reference","Herbert Schildt",458756455);
    Book book2 = new Book("The C++ Programming Language","Bjarne Stroustrup",589716654);
    Book book3 = new Book("Java: A Beginners Guide","Herbert Schildt",697423545);
    Book book4 = new Book("Introduction to Machine Learning With Python","Andreas C. Müller, Sarah Guido",477974968);

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.addBook(book4);
//Getting Books:
    System.out.println("Books in the library collection:\n");
    library.getBooks().forEach((book) -> 
    {
        System.out.println(book.getTitle() + " by " + book.getAuthor() + "  " +book.getISBN());
    });
//Removing Books:
    library.removeBook(book2);
    System.out.println("\nBooks in the library collection after removing " + book2.getTitle() + ":" + "\n");
    library.getBooks().forEach((book) -> 
    {
        System.out.println(book.getTitle() + " by " + book.getAuthor() + "  " +book.getISBN());
    });
  }
}

