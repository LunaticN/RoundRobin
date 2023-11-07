import java.util.ArrayList;
import java.util.Collections;

public class Match {
    ArrayList<String> teams;
    ArrayList<Integer> teamsInNums;
    int numTeams;
    int rounds;
    int mpr;

    public Match(ArrayList<String> teams){
        this.teams = teams;
        this.numTeams = teams.size();
        this.teamsInNums = new ArrayList<Integer>();
        for (int i = 0; i < numTeams; i++) {
            teamsInNums.add(i + 1);
        }
        this.rounds = numTeams - 1;
        this.mpr = (rounds + 1) / 2;
        if (teams.size() % 2 == 0){
            rounds--;
            mpr--;
        }
        if (teams.size() % 2 != 0){
            teams.add("Break");
            teamsInNums.add(teamsInNums.get((teamsInNums.size() - 1)) + 1);
        }
    }
    public ArrayList<Integer> getTeamsInNums(){
        return teamsInNums;
    }
    public ArrayList<String> getTeams(){
        return teams;
    }
    public int getRounds(){
        return rounds;
    }
    public int getMpr(){
        return mpr;
    }

    public ArrayList<Integer> matchUps(){
        ArrayList<Integer> matchAtHand = new ArrayList<Integer>();
        for (int i = 0; i <= mpr; i++) {
            matchAtHand.add(teamsInNums.get(i));
            matchAtHand.add(teamsInNums.get(teamsInNums.size() - 1) - i);
        }
//        for (int i = 0; i <= rounds - 1; i++) { //DOESNT WORK PROPERLY
//            Collections.rotate(teamsInNums.subList(1, teamsInNums.size()), i);
//            for (int j = 0; j <= mpr; j++) {
//                matchAtHand.add(teamsInNums.get(i));
//                matchAtHand.add(teamsInNums.get(teamsInNums.size() - 1) - i);
//            }
//        }
        return matchAtHand;
    }
}
