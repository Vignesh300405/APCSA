public class FootballPlayer {

    //Number 1
    String name;
    String position;
    String team;
    int years;

    //Number 2
    public FootballPlayer(String playerName, String playerPosition, String playerTeam) {
        name = playerName;
        position = playerPosition;
        team = playerTeam;
        years = 0;
    }

    //Number 3
    public void setTeam(String newTeam) {
        team = newTeam;
    }

    //Number 4
    public String getTeam() {
        return team;
    }

    //Number 5
    public void increaseYears() {
        years++;
    }

    //Number 6
    public boolean equals(FootballPlayer fp) {
        return team.equals(fp.getTeam());
    }

    //Number 7

    public String toString() {
        return "Name: " + name +
                " Team: " + team +
                " Position: " + position +
                " Years of Service: " + years;
    }
}
