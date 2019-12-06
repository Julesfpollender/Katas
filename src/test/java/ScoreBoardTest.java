import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class ScoreBoardTest {
    @Test
    public void testScoreBoard_player1Score_expectedFifteenForPlayer1(){
        // Prepare
        ScoreBoard scoreBoard = new ScoreBoard();

        // Preconditions
        assertThat(scoreBoard.getPlayer1Score(), is(Score.LOVE.getText()));
        assertThat(scoreBoard.getPlayer2Score(), is(Score.LOVE.getText()));

        // Test
        scoreBoard.player1Score();

        // Verify
        assertThat(scoreBoard.getPlayer1Score(), is(Score.FIFTEEN.getText()));
        assertThat(scoreBoard.getPlayer2Score(), is(Score.LOVE.getText()));
    }

    @Test
    public void testScoreBoard_player1AtFortyThenScore_expectedWinnerForPlayer1(){
        // Prepare
        ScoreBoard scoreBoard = new ScoreBoard(Score.FORTY, Score.LOVE);

        // Preconditions
        assertThat(scoreBoard.getPlayer1Score(), is(Score.FORTY.getText()));
        assertThat(scoreBoard.getPlayer2Score(), is(Score.LOVE.getText()));

        // Test
        scoreBoard.player1Score();

        // Verify
        assertThat(scoreBoard.getPlayer1Score(), is(Score.WINNER));
        assertThat(scoreBoard.getPlayer2Score(), is(Score.LOSER));
    }

    @Test
    public void testScoreBoard_player1AtDeuceThenScore_expectedAdvantageForPlayer1(){
        // Prepare
        ScoreBoard scoreBoard = new ScoreBoard(Score.DEUCE, Score.DEUCE);

        // Preconditions
        assertThat(scoreBoard.getPlayer1Score(), is(Score.DEUCE.getText()));
        assertThat(scoreBoard.getPlayer2Score(), is(Score.DEUCE.getText()));

        // Test
        scoreBoard.player1Score();

        // Verify
        assertThat(scoreBoard.getPlayer1Score(), is(Score.ADVANTAGE.getText()));
        assertThat(scoreBoard.getPlayer2Score(), is(Score.DEUCE.getText()));
    }

    @Test
    public void testScoreBoard_player1AtAdvantageThenScore_expectedWinnerForPlayer1(){
        // Prepare
        ScoreBoard scoreBoard = new ScoreBoard(Score.ADVANTAGE, Score.DEUCE);

        // Preconditions
        assertThat(scoreBoard.getPlayer1Score(), is(Score.ADVANTAGE.getText()));
        assertThat(scoreBoard.getPlayer2Score(), is(Score.DEUCE.getText()));

        // Test
        scoreBoard.player1Score();

        // Verify
        assertThat(scoreBoard.getPlayer1Score(), is(Score.WINNER));
        assertThat(scoreBoard.getPlayer2Score(), is(Score.LOSER));
    }
}
