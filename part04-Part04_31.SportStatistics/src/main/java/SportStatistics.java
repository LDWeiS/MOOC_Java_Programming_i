
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fName = scan.nextLine();
        ArrayList<TeamData> records = readFile(fName);

        System.out.println("Team:");
        String teamInput = scan.nextLine();

        gamesPlayed(records, teamInput);
        getResults(records, teamInput);

    }

    public static ArrayList<TeamData> readFile(String fName) {
        ArrayList<TeamData> teamData = new ArrayList<>();

        try (Scanner fScan = new Scanner(Paths.get(fName))) {
            while (fScan.hasNextLine()) {
                String gameData = fScan.nextLine();
                String[] dataSplit = gameData.split(",");
                String home = dataSplit[0];
                String away = dataSplit[1];
                int hPoints = Integer.valueOf(dataSplit[2]);
                int aPoints = Integer.valueOf(dataSplit[3]);

                teamData.add(new TeamData(home, away, hPoints, aPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return teamData;
    }

    public static void gamesPlayed(ArrayList<TeamData> records, String teamInput) {
        int count = 0;

        for (TeamData team : records) {
            if (team.getNHome().equals(teamInput) || team.getNVisit().equals(teamInput)) {
                count++;
            }
        }

        System.out.println("Games: " + count);
    }

    public static void getResults(ArrayList<TeamData> records, String teamInput) {
        int win = 0;
        int lose = 0;

        for (TeamData team : records) {
            if (teamInput.equals(team.getNHome())) {
                if (team.getPHome() > team.getPVisit()) {
                    win++;
                } else {
                    lose++;
                } 
            } else if (teamInput.equals(team.getNVisit())){
                if (team.getPVisit() > team.getPHome()){
                    win++;
                } else {
                    lose++;
                }
            } else {
                continue;
            }
        }
        
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);
    }

}
