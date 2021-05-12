package clean_code_refactoring.bai_tap.refactoring;

public class TennisGame {

    public static final int three = 3;
    public static final int THREE = three;
    public static final int TWO = 2;
    public static final int ONE = 1;
    public static final int ZERO = 0;
    public static final int ZERO1 = 0;
    public static final int ONE1 = 1;
    public static final int TWO1 = 2;
    public static final int THREE1 = 3;

    public static String getScore(String player1Name, String player2Name, int player1Score, int Play2Score) {
        String score = "";
        if (player1Score == Play2Score) {
            score = displayScore(player1Score);
        } else {
            boolean overScore = player1Score >= 4 || Play2Score >= 4;
            if (overScore) {
                score = displayScoreOver(player1Score, Play2Score);
            } else {
                score = displayScoreUnder(player1Score, Play2Score, score);
            }
        }
        return score;
    }

    public static String displayScoreUnder(int player1Score, int Play2Score, String score) {
        int tempScore;
        StringBuilder scoreBuilder = new StringBuilder(score);
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Score;
            else {
                scoreBuilder.append("-");
                tempScore = Play2Score;
            }
            switch (tempScore) {
                case ZERO1:
                    scoreBuilder.append("Love");
                    break;
                case ONE1:
                    scoreBuilder.append("Fifteen");
                    break;
                case TWO1:
                    scoreBuilder.append("Thirty");
                    break;
                case THREE1:
                    scoreBuilder.append("Forty");
                    break;
            }
        }
        score = scoreBuilder.toString();
        return score;
    }

    public static String displayScoreOver(int player1Score, int Play2Score) {
        String score;
        int minusResult = player1Score - Play2Score;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    public static String displayScore(int player1Score) {
        String score;
        switch (player1Score) {
            case ZERO:
                score = "Love-All";
                break;
            case ONE:
                score = "Fifteen-All";
                break;
            case TWO:
                score = "Thirty-All";
                break;
            case THREE:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
