
public class Car
{
    // instance variables - replace the example below with your own
    private int year;
    private String model;
    
    public Car (String mod, int yr){
        this.year=yr;
        this.model=mod;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }
    public String toString(){
        return "a "+this.year+" "+this.model;
    }
    public boolean equals(Car otherCar){
        if(this.model.equals(otherCar.model)&&this.year==otherCar.year){
            return true;
        }
        else{
            return false;
        }
    }
}
