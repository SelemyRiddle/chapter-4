
public class Library
{
    private String name;
    private Book[] inventory;
    public Library(String nm, int num)
    {
        this.name=nm;
        this.inventory=new Book[num];
    }
    public void addBook(Book b, int index){
        inventory[index]=b;
        index++;
    }
    public String toString(){
        String output= "Books in this library:\n";
        for (Book b: inventory){
            output+= b +"\n";
            
        }
        
        return output;
    }
}
