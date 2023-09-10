//(Part - 01)
public class Book 
{
  private String title;
  private String author;
  private int ISBN;
/*
  Made by: @PRIYABRATA CHOWDHURY - 23010105
*/
  public Book(String title, String author,int ISBN) 
  {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
  }
//Getting title:
  public String getTitle() 
  {
    return title;
  }
//Setting title:
  public void setTitle(String title) 
  {
    this.title = title;
  }
//Getting Author:
  public String getAuthor() 
  {
    return author;
  }
//Setting Author:
  public void setAuthor(String author) 
  {
    this.author = author;
  }
//Getting ISBN:
   public int getISBN() 
  {
    return ISBN;
  }
//Setting ISBN:
  public void setISBN(int ISBN) 
  {
    this.ISBN = ISBN;
  }
}
