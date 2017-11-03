
public class CarDriver
{
    public static  void main(String[] args){
        Car stang=new Car("Mustang",1973);
        System.out.println(stang);
        Car yourCar=new Car("Mustang",1973);
        System.out.println(stang.equals(yourCar));
    }
}
