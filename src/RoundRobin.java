import java.util.ArrayList;
import java.util.Scanner;

public class RoundRobin {
    public static void main(String[] args) {
        ArrayList<String> teams = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("How many teams will be participating? ");
        int numTeams = Integer.parseInt(input.nextLine());
        for (int i = 0; i < numTeams; i++) {
            System.out.println("Team " + (i + 1) + ": ");
            teams.add(input.nextLine());
        }
        Matches matches = new Matches(teams);
        Rounds rounds = new Rounds(matches.matchUps(), teams);
        System.out.println(matches.getTeamsInNums());
        System.out.println(matches.getTeams());
        System.out.println(matches.getRounds());
        System.out.println(matches.getMpr());
        System.out.println(matches.matchUps());
        System.out.println("-------------------------");
        System.out.println(rounds.intoRounds());
//        RoundRobin tournament = new RoundRobin(teams);
//        System.out.println(tournament.generate());
    }
}