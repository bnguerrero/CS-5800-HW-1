package CS5800HW1.aggregation;

public class Textbook 
{
    private String title, author, publisher;
    
    /**
     * Constructor initializes the title, author, and publisher.
     * @param title the textbook's title.
     * @param author the textbooks's author.
     * @param publisher the textbooks's publisher. 
     */
    public Textbook(String title, String author, String publisher)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    /**
     * The copy constructor initializes the object as a copy of another instructor object. 
     * @param textbook the object to copy.
     */
    public Textbook(Textbook textbook)
    {
        this.title = textbook.title;
        this.author = textbook.author;
        this.publisher = textbook.publisher;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public String toString()
    {
        String statement = title + ", " + author + ", " + publisher;

        return statement;
    }
}
