
public class TestPersonAndBook {

  public static void main (String[] args) {
	  
  Book mybook = new Book("The Bible" , "Jesus" , 100000);	  
  Person bob = new Person("Bob", 18 , "masculine");	  
  
  System.out.println(mybook);
  bob.read(mybook);


}
}