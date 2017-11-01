public class PetDriver
{
    public static void main(String[] args){
        Pet spot= new Pet(12,"Cat", "Spot");
        Pet.example();
        System.out.println("Number of Pets: "+Pet.numPets);
        System.out.println(spot);
    }
}
