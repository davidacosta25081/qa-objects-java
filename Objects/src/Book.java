
public class Book {

  public String title;
  public String author;
  public int numOfPages;
  
  
  
  public Book(String title, String author, int numOfPages) {
    this.title = title;
    this.author = author;
    this.numOfPages = numOfPages;
  }
  

  public String toString() {
	  
  String temp = " Book title: " + title + 
		        "\n Author : " + author +
		        "\n Number of Pages: " + numOfPages;
  return temp;
  
  
  }
  
  
  
  








}
