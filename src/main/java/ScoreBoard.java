import java.util.Arrays;
import java.util.List;

public class ScoreBoard {
    private int _player1Score;
    private int _player2Score;

    public ScoreBoard(){
        _player1Score = 0;
        _player2Score = 0;
    }

    public ScoreBoard(Score player1Score, Score player2Score){
        _player1Score = player1Score.getValue();
        _player2Score = player2Score.getValue();
    }

    public void player1Score(){
        Score playerScoringScore = Score.fromValue(_player1Score).get();
        Score otherPlayerScore = Score.fromValue(_player2Score).get();

        // Deuce
        if(playerScoringScore == Score.THIRTY && otherPlayerScore == Score.FORTY){
            _player1Score = Score.DEUCE.getValue();
            _player2Score = Score.DEUCE.getValue();
        }
        // Deuce Again
        else if(playerScoringScore == Score.DEUCE && otherPlayerScore == Score.ADVANTAGE){
            _player1Score = Score.DEUCE.getValue();
            _player2Score = Score.DEUCE.getValue();
        }
        // Advantage
        else if(playerScoringScore == Score.DEUCE && otherPlayerScore == Score.DEUCE) {
            _player1Score = Score.ADVANTAGE.getValue();
            _player2Score = Score.DEUCE.getValue();
        } else {
            _player1Score++;
        }
    }

    public void player2Score(){
        Score playerScoringScore = Score.fromValue(_player2Score).get();
        Score otherPlayerScore = Score.fromValue(_player1Score).get();

        // Deuce
        if(playerScoringScore == Score.THIRTY && otherPlayerScore == Score.FORTY){
            _player1Score = Score.DEUCE.getValue();
            _player2Score = Score.DEUCE.getValue();
        }
        // Deuce Again
        else if(playerScoringScore == Score.DEUCE && otherPlayerScore == Score.ADVANTAGE){
            _player1Score = Score.DEUCE.getValue();
            _player2Score = Score.DEUCE.getValue();
        }
        // Advantage
        else if(playerScoringScore == Score.DEUCE && otherPlayerScore == Score.DEUCE) {
            _player1Score = Score.DEUCE.getValue();
            _player2Score = Score.ADVANTAGE.getValue();
        } else {
            _player2Score++;
        }
    }

    public String getPlayer1Score() {
        return Score.fromValue(_player1Score).get().getText();
    }

    public String getPlayer2Score() {
        return Score.fromValue(_player2Score).get().getText();
    }
}
