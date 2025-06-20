
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<>();

        System.out.println("File: ");
        String file = scan.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            System.out.println("Team: ");    
            String teamName = scan.nextLine();

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] lineSplit = line.split(",");

                String home = lineSplit[0];
                String away = lineSplit[1];
                int homeScore = Integer.parseInt(lineSplit[2]);
                int awayScore = Integer.parseInt(lineSplit[3]);

                games.add(new Game(home, away, homeScore, awayScore));
            }

            int gamesPlayed = 0;
            int wins = 0;
            int losses = 0;

            for (Game game:games) {
                if (game.isInvolved(teamName)) {
                    gamesPlayed++;
                    if (game.isWinFor(teamName)) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }

            System.out.println("Games: " + gamesPlayed);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e.getMessage());
        }
    }

}
