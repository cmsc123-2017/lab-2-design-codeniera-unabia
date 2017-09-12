class Book {
  Author author;
  String title;
  int year;  // published
  
  Book(Author author, String title, int year) {
    this.author = author;
    this.title = title;
    this.year = year;
  }
  
  // TEMPLATE
  /*   Fields:
   *     this.author   -- Author
   *     this.title    -- String
   *     this.year     -- int
   * 
   *   Methods:
   *     sameAuthor(Book that)     -- boolean
   *     publishedBefore(Book a)   -- boolean
   *
   *   Methods of author:
   *     this.author.equals()  -- boolean
   */
  
  // Book -> boolean
  // Accepts this Book
  // Returns true if this Book has the same author with another book
  boolean sameAuthor(Book that) {    
    return this.author.equals(that.author);
    
    // TEMPLATE
    /*    Fields:
     *    this.author   -- Author
     *    this.title    -- String
     *    this.year     -- int
     *
     *    that
     *    that.author   -- Author
     *    that.title    -- String
     *    that.year     -- int
     */
  }
 
  // Book -> boolean
  // Accepts this book
  // Returns true if this book was published before the other book
  boolean publishedBefore(Book that){
    return that.year > this.year;
    
    // TEMPLATE
    /*    
     *    Fields:
     *    this.author   -- Author
     *    this.title    -- String
     *    this.year     -- year
     *
     *    that
     *    that.author   -- Author
     *    that.title    -- String
     *    that.year     -- int
     *    
     */
  }
  
}
