

public class Factory
{
    private double sqFootage;
    private Car[] inventory;
    
    public Factory(double sqft, int num)
    {
        this.sqFootage=sqft;
        this.inventory=new Car[num];
        
    }
    public void setCar(Car c, int index){
        inventory[index]=c;
    }
    public String toString(){
        String output= "This factory has \n";
        for (Car c: inventory){
            output+= c +"\n";
            
        }
        
        return output;
    }
}
