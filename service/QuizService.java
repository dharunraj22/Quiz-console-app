package service;

import model.Question;

public class QuizService {

    private int score = 0;

    public boolean checkAnswer(Question question, int userAnswer){
        if(userAnswer == question.getCorrectOptionIndex() + 1){
            score++;
            return true;
        }
        return false;
    }

    public int getScore() {
        return score;
    }

    public void resetScore() {
        score = 0;
    }
    
}
