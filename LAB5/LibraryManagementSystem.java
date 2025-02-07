class Person 
{
    String name;
    
    public Person(String name) 
    {
        this.name = name;
    }
    
    public void whoYouAre() 
    {
        System.out.println("I am " + name);
    }
}

class Reader extends Person 
{
    Book borrowedBook;
    
    public Reader(String name) 
    {
        super(name);
    }
    
    public void borrowBook(Book book) 
    {
        borrowedBook = book;
        System.out.println(name + " borrowed " + book.title);
    }
    
    public void returnBook() 
    {
        System.out.println(name + " returned " + borrowedBook.title);
        borrowedBook = null;
    }
}

class Author extends Person 
{
    Book authoredBook;
    
    public Author(String name) 
    {
        super(name);
    }
    
    public void addNewBook(String bookID, String title) 
    {
        authoredBook = new Book(bookID, title, this.name);
        System.out.println(name + " authored " + title);
    }
}

class Book 
{
    String id;
    String title;
    String author;
    
    public Book(String id, String title, String author) 
    {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}

public class LibraryManagementSystem 
{
    public static void main(String[] args) 
    {
        Author author = new Author("J.K. Rowling");
        author.addNewBook("101", "Harry Potter");
        
        Reader reader = new Reader("John Doe");
        reader.borrowBook(author.authoredBook);
        reader.returnBook();
        
        author.whoYouAre();
        reader.whoYouAre();
    }
}