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

    public ArrayList<ArrayList<ArrayList<Integer>>> intoRounds(){
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
        //System.out.println(roundSets);
        int multi = 0;
        //iterate through roundSets with counter, append to tournament list when counter = mpr
        for (int i = 0; i < rounds; i++) {
            for (int j = 0; j < mpr; j++) {
                roundAtHand.add(roundSets.get(j + multi));
                //System.out.println(roundAtHand);
            }
            tournament.add(new ArrayList<>(roundAtHand));
            multi+=mpr;
            roundSets.subList(mpr, roundSets.size());
            roundAtHand.clear();

        }
        //for i in rounds, for j in pairs (i+=mpr)
        return tournament;
    }
}
