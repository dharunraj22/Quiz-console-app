package controller;

import model.Question;
import model.Quiz;
import view.ConsoleView;
import service.QuizService;

import java.util.List;

public class QuizController {
    private final Quiz quiz;
    private final ConsoleView view;
    private final QuizService service;

    public QuizController(Quiz quiz, ConsoleView view, QuizService service) {
        this.quiz = quiz;
        this.view = view;
        this.service = service;
    }

    public void startQuiz() {
        view.showWelcomeMessage();
        List<Question> questions = quiz.getQuestions();

        for (int i = 0; i < questions.size(); i++){
            Question q = questions.get(i);
            view.showQuestion(q, i);
            int userAnswer = view.getUserAnswer();

            if (service.checkAnswer(q, userAnswer)) {
                view.showCorrect();
            } else {
                view.showIncorrect(q.getOptions().get(q.getCorrectOptionIndex()));
            }
        }

        view.showScore(service.getScore(), questions.size());
        view.closeScanner();
    }
    
}
