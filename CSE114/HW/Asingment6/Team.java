import java.util.ArrayList;

public class Team {
    private String teamName;
    ArrayList<Player> players;    

    Team(String teamName) {
        this.teamName = teamName;

        players = new ArrayList<Player>();
    }

    void addPlayer(int no, String position, String name, String height, int weight, String hand, double avg) {
        players.add(new Player(no, position, name, height, weight, hand, avg));
    }

    Player searchPlayer(String targetName) {
        for(Player p: players) {
            if(p.name.equals(targetName)) {
                return p;
            }
        }
        return new Player(0, null, null, null, 0, null, 0);
    }

    double battingAverage() {
        double sum = 0;
        
        for(Player p: players) {
            sum += p.avg;
        }

        return sum / players.size();
    }

    double battingAverageMinusPitchers() {
        double sum = 0;
        int size = 0;
        for(Player p: players){
            if(!p.position.equals("P")) {
                sum += p.avg;
                size++;
            }
        }
        return sum / size;
    }

    int numberOfPlayersBatting(String flag){
        int ans = 0;
        for(Player p: players){
            if(p.hand.equals(flag)) ans++;
        }

        return ans;
    }

    int numberOfPlayersInPosition(String flag){
        int ans = 0;
        for(Player p: players){
            if(p.position.equals(flag)) ans++;
        }

        return ans;
    }

    private String getTeamname() {
        return teamName;
    }
}
