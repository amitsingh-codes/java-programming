
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Teamrecord> teams = new ArrayList<>();

        System.out.println("File: ");
        String file = scan.nextLine();
        try(Scanner reader = new Scanner(Paths.get(file))) {
        while (reader.hasNextLine()) {
            String row = reader.nextLine();
            String[] parts = row.split(",");

            String home_team = parts[0];
            String visiting_team = parts[1];
            int home_team_score = Integer.valueOf(parts[2]);
            int visiting_team_score = Integer.valueOf(parts[3]);

            teams.add(new Teamrecord(home_team, visiting_team, home_team_score, visiting_team_score));
            }
        }catch (Exception e) {
                System.out.println("Error : " + e.getMessage());
        }

        System.out.println("Team: ");
        String team_name = scan.nextLine();
        int count = 0;
        int win = 0 , loss = 0 ;

        for (Teamrecord team : teams) {
                if (team_name.equals(team.gethometeam())) {
                    if (team.gethometeamscore() < team.getvisitingteamscore()) {
                        loss++;
                        count++;
                    }else{
                        win++;
                        count++;
                    }
                }else if(team_name.equals(team.getvisitingteam())){
                    if (team.gethometeamscore() > team.getvisitingteamscore()) {
                        loss++;
                        count++;
                    }else{
                        win++;
                        count++;
                    }
                }else{
                    continue;
                }
            
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
    }
}