import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teams = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("How many teams will be participating? ");
        int numTeams = Integer.parseInt(input.nextLine());
        for (int i = 0; i < numTeams; i++) {
            System.out.println("Team " + (i + 1) + ": ");
            teams.add(input.nextLine());
        }
        Match matches = new Match(teams);
        System.out.println(matches.getTeamsInNums());
        System.out.println(matches.getTeams());
        System.out.println(matches.getRounds());
        System.out.println(matches.getMpr());
        System.out.println(matches.matchUps());
//        RoundRobin tournament = new RoundRobin(teams);
//        System.out.println(tournament.generate());
    }
}