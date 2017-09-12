import junit.framework.TestCase;
public class BookTest extends TestCase {
 
  public void testSameAuthorSame() {
    Author hawking = new Author("Stephen Hawking", "M");
    Author rowling = new Author("J.K. Rowling", "F");
    
    Book time = new Book(hawking, "A Brief History of Time", 1988);
    Book stone = new Book(rowling, "The Philosophers's Stone",  1997);
    
    assertEquals(false, time.sameAuthor(stone));
  }
  
  public void testSameAuthorNotSame() {
    Author rowling = new Author("J.K. Rowling", "F");
    
    Book stone = new Book(rowling, "The Philosophers's Stone", 1997);
    Book secrets = new Book(rowling, "The Chamber of Secrets", 1998);
    
    assertEquals(true, secrets.sameAuthor(stone));
  }
  
  public void testCompareYear(){
    Book a = new Book(new Author("Manolo", "M"), "1st Book", 2015);
    Book b = new Book(new Author("Jai", "F"), "My Book", 2017);
    
    assertEquals(true, a.publishedBefore(b));
    assertEquals(false, b.publishedBefore(a));
    
    Book c = new Book(new Author("Manolo", "M"), "2nd Book", 2016);
    Book d = new Book(new Author("Manolo", "M"), "3rd Book", 2015);

    assertEquals(false, c.publishedBefore(d));
    assertEquals(true, d.publishedBefore(c));  
  }
}
