import java.util.ArrayList;

public class Matches {
    ArrayList<String> teams;
    ArrayList<Integer> teamsInNums;
    int numTeams;
    int rounds;
    int mpr;

    public Matches(ArrayList<String> teams) {
        this.teams = teams;
        this.numTeams = teams.size();
        this.teamsInNums = new ArrayList<Integer>();
        for (int i = 0; i < numTeams; i++) {
            teamsInNums.add(i + 1);
        }
        this.rounds = numTeams - 1;
        this.mpr = (rounds + 1) / 2;
        if (teams.size() % 2 == 0) {
            rounds--;
            mpr--;
        }
        if (teams.size() % 2 != 0) {
            teams.add("Break");
            teamsInNums.add(teamsInNums.get((teamsInNums.size() - 1)) + 1);
        }
    }

    public ArrayList<Integer> getTeamsInNums() {
        return teamsInNums;
    }

    public ArrayList<String> getTeams() {
        return teams;
    }

    public int getRounds() {
        return rounds;
    }

    public int getMpr() {
        return mpr;
    }

    public ArrayList<Integer> matchUps() {
            ArrayList<Integer> allMatches = new ArrayList<Integer>();
            int originalLength = teamsInNums.size();
            for (int i = 0; i < originalLength; i++) {
                for (int j = 1 + i; j < teamsInNums.size(); j++) {
                    allMatches.add(i + 1);
                    allMatches.add(j + 1); //problem portion
                }
                teamsInNums.subList(1, teamsInNums.size() - 1);
            }
            return allMatches;
        }
    }