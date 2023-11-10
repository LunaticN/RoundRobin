import java.util.ArrayList;
import java.util.Collections;

public class Rounds {
    ArrayList<Integer> matches;
    int rounds;
    int mpr;

    public Rounds(ArrayList<Integer> matches, ArrayList<String> teams){
        this.matches = matches;
        this.rounds = teams.size() - 1;
        this.mpr = (rounds + 1) / 2;
    }

    public ArrayList<ArrayList<Integer>> intoRounds(){
        ArrayList<ArrayList<Integer>> roundSets = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> pairs = new ArrayList<Integer>();
        for (int i = 0; i <= matches.size() - 1; i+=2) {
            pairs.add(matches.get(i));
            pairs.add(matches.get(i + 1));
            roundSets.add(new ArrayList<>(pairs));
            pairs.clear();
        }
        Collections.shuffle(roundSets);
        ArrayList<ArrayList<ArrayList<Integer>>> tournament = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<ArrayList<Integer>> roundAtHand = new ArrayList<ArrayList<Integer>>();
        return roundSets;
    }
}
