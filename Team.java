
public class Team
{
    private String teamName;
    private Athlete[] players;
    public Team(String tnm, int num)
    {
        this.teamName=tnm;
        this.players= new Athlete[num];
    }
    public void addPlayer(Athlete a, int index){
        players[index]=a;
        index++;
    }
    public String toString(){
        String output= "Players on this team: \n";
        for (Athlete a: players){
            output+= a + "\n";
        }
        return output;
    }
}
