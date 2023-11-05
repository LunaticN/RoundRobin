import java.lang.reflect.Array;
import java.util.ArrayList;
public class RoundRobin {
    ArrayList teams;
    int numTeams;

    public RoundRobin(ArrayList teams){
        this.teams = teams;
        this.numTeams = teams.size();
    }

    public void evenOut(){
        if (teams.size() % 2 != 0){
            teams.add("Break");
        }
    }

    public ArrayList generate(){
        //set up
        int rounds = numTeams - 1;
        int mpr = (rounds + 1) / 2;

        ArrayList<Integer> teamsInNums = new ArrayList<Integer>();
        for (int i = 0; i < numTeams; i++) {
            teamsInNums.add(i + 1);
        }
        if (teamsInNums.size() % 2 != 0){
            teamsInNums.add(teamsInNums.get((teamsInNums.size() - 1)) + 1);
        }

        //logic (help.)
        ArrayList<ArrayList<ArrayList<Integer>>> tournament = new ArrayList();
        for (int i = 0; i < rounds; i++) {
            for (int j = 0; j < mpr; j++) {

            }

        }
        return teamsInNums;
        //for i in rounds
            //for i in matches
            //do the match ups here
        //create an arraylist inside the big one


    }
}