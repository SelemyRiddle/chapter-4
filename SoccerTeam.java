

public class SoccerTeam
{
    public static void main(String[] args){
        Team soccer= new Team("Thunder",5);
        Athlete tom= new Athlete("Tom",17);
        soccer.addPlayer(tom,0);
        System.out.println(soccer);
    }

}
