import java.util.ArrayList;
import java.util.Collections;

/**
 * The Rounds class creates a two-dimensional ArrayList using the linear ArrayList of matchups from the Matches class
 */
public class Rounds {
    ArrayList<Integer> matches;
    int rounds;
    int mpr;

    /**
     * Constructor for the Rounds class; creates a new instance of a Round given the below parameters
     * @param matches represents the ArrayList of match ups assembled in the Matches class
     * @param teams represents the ArrayList of teams acquired in the runner class RoundRobin
     */
    public Rounds(ArrayList<Integer> matches, ArrayList<String> teams){
        this.matches = matches;
        this.rounds = teams.size() - 1;
        this.mpr = (rounds + 1) / 2;
    }

    /**
     * the intoRounds method takes in the matches Arraylist and organizes the matches into individual pairs
     * @return returns a two-dimensional ArrayList containing pairs of matches
     */
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
//        ArrayList<ArrayList<ArrayList<Integer>>> tournament = new ArrayList<ArrayList<ArrayList<Integer>>>();
//        ArrayList<ArrayList<Integer>> roundAtHand = new ArrayList<ArrayList<Integer>>();
//        //System.out.println(roundSets);
//        int multi = 0;
//        for (int i = 0; i < rounds; i++) {
//            for (int j = 0; j < mpr; j++) {
//                roundAtHand.add(roundSets.get(j + multi));
//            }
//            tournament.add(new ArrayList<>(roundAtHand));
//            multi+=mpr;
//            roundSets.subList(mpr, roundSets.size());
//            roundAtHand.clear();
//
//        }
        return roundSets;
    }
}
