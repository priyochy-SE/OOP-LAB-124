//(Part - 02)
import java.util.ArrayList;
/*
  Made by: @PRIYABRATA CHOWDHURY - 23010105
*/
public class Library 
{
  private final ArrayList < Book > books;

  public Library() 
  {
    books = new ArrayList <  > ();
  }
//Adding Books:
  public void addBook(Book book) 
  {
    books.add(book);
  }
//Removing Books:
  public void removeBook(Book book) 
  {
    books.remove(book);
  }
//Getting Books:
  public ArrayList < Book > getBooks() 
  {
    return books;
  }
}
