

public class Book
{
    
    private String title;
    private Author bookAuthor;
    
    public Book(String tit, Author by)
    {
        
        this.title=tit;
        this.bookAuthor=by;
    }
    
    public String getTitle(){
        return this.title;
    }
    public Author getAuthor(){
        return this.bookAuthor;
    }
    public String toString(){
        return this.title+" was written by "+bookAuthor;
    }
}
