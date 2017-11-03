
public class Name
{
    private String first;
    private String middle;
    private String last;
    public Name(String nm1, String nm2, String nm3)
    {
        this.first=nm1;
        this.middle=nm2;
        this.last=nm3;
    }
    public String getFirst(){
        return this.first;
    }
    public String getMiddle(){
        return this.middle;
    }
    public String getLast(){
        return this.last;
    }
    public String firstMiddleLast(){
        return this.first+" "+this.middle+" "+this.last;
    }
    public String lastfirstMiddle(){
        return this.last+", "+this.first+" "+this.middle;
    }
    public boolean equals(Name otherName){
        if (this.first.equalsIgnoreCase(otherName.first)&&this.middle.equalsIgnoreCase(otherName.middle)&&this.last.equalsIgnoreCase(otherName.last)){
            return true;
        }
        else{
            return false;
        }
    }
    
}
