
public class Pet
{
    // instance variables - replace the example below with your own
    private String species;
    private int yearsHad;
    private String name;
    public static int numPets;
    /**
     * Constructor for objects of class Pet
     */
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Pet (int age, String type, String nm){
       this.yearsHad=age;
       this.species=type;
       this.name=nm;
       numPets++;
    }
    public void setyearsHad(int age){
        this.yearsHad=age;
    }
    public int getAge(){
        return this.yearsHad;
    }
    public String getName(){
        return this.name;
    }
    public String getSpecies(){
        return this.species;
    }
    public String toString(){
        return "The pet is a "+this.species+" named "+this.name;
    }
    public static void example(){
        System.out.println("This is static!");
    }
}
