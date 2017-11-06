import java.util.Scanner;
public class AHS_Library
{
    
    public static void main(String[] args){
        Library acalanes=new Library("AHS",10);
        Author a= new Author("Kurt", 43);
        Author a2=new Author("Sam",21);
        Book b=new Book("Cat's Cradle",a);
        Book b2= new Book("My Brother Sam is Dead",a2);
        acalanes.addBook(b,0);
        acalanes.addBook(b2,1);
        System.out.println(acalanes);
    }
}
