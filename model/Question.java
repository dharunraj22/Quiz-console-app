package model;

import java.util.List;

public class Question {
    private String questionText;
    List<String> options;
    private int answer;

    public Question(String questionText, List<String> options, int answer) {
        this.questionText = questionText;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getAnswer() {
        return answer;
    }

}
