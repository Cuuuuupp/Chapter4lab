public class Team {
    private String name;
    private Athlete[] players;
    
    public Team(String nme, int number) {
        this.name = nme;
        this.players = new Athlete[number];
    }   
    public void  addAthlete (Athlete a, int index) {
        players[index] = a;
    }
    public String toString() {
        String output = " Team " + this.name + " has these players: \n";
        for(Athlete a: players) {
            output += a + "\n";
        }
        return output;
    }
}