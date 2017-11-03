
public class FactoryDriver
{
    // instance variables - replace the example below with your own
    public static void main(){
        Factory tesla=new Factory(2000,5);
        Car c = new Car("Model 3", 2017);
        tesla.setCar(c,0);
        System.out.println(tesla);
    }
}
