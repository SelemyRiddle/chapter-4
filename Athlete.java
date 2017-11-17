

public class Athlete
{
    private String name;
    private int age;
    public Athlete(String nm, int old)
    {
        this.name=nm;
        this.age=old;
    }
    public String toString(){
        return this.name+" is "+this.age+" years old";
    }
    
}
