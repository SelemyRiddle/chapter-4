
public class Hat
{
    // instance variables - replace the example below with your own
    private String color;
    private boolean fedora;
    public Hat(String co, boolean neckBeard)
    {
        // initialise instance variables
        this.color=co;
        this.fedora=neckBeard;
    }
    public String getColor(){
        return this.color;
    }
    public boolean getFedora(){
        return this.fedora;
    }
    public String toString(){
        return "The hat is "+this.color+" and it is "+this.fedora+" that the hat is a fedora";
    }
}
