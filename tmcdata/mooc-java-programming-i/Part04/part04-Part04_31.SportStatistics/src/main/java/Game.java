public class Game {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;

    public Game(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public boolean isInvolved(String teamName) {
        return homeTeam.equals(teamName) || awayTeam.equals(teamName);
    }

    public boolean isWinFor(String teamName) {
        if (homeTeam.equals(teamName)) {
            return homeScore > awayScore;
        } else if (awayTeam.equals(teamName)) {
            return awayScore > homeScore;
        } else {
            return false;
        }
    }

    public boolean isLossFor(String teamName) {
        return isInvolved(teamName) && !isWinFor(teamName);
    }
}
