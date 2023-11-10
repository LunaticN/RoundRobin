import java.util.ArrayList;
import java.util.Collections;

public class Rounds {
    ArrayList<Integer> matches;

    public Rounds(ArrayList<Integer> matches, ArrayList<String> teams){
        this.matches = matches;
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
        //assemble rounds (for i in rounds, for j in matches per round, but how to skip by mpr?)
        //for i in rounds, for j matches per round, for k in pairs (i+=mpr)
        return roundSets;
    }
}